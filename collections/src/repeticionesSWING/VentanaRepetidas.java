package repeticionesSWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class VentanaRepetidas {
    JFrame ventana;
    PanelTexto[] paneles;
    JPanel panelPrincipal;

    public VentanaRepetidas(int repeticiones,String texto) {
        ventana=new JFrame("REPETICIONES");
        panelPrincipal=new JPanel(new GridLayout(0,1));
        paneles=new PanelTexto[repeticiones];
        for (int i = 0; i < repeticiones; i++) {
            paneles[i]=new PanelTexto(texto);
            panelPrincipal.add(paneles[i]);
        }
        JButton cerrar=new JButton("Cerrar");
        panelPrincipal.add(cerrar);
        cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });

        ventana.add(panelPrincipal);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }

    public VentanaRepetidas(List<String> textos) {
        ventana=new JFrame("REPETICIONES");
        panelPrincipal=new JPanel(new GridLayout(0,1));
        paneles=new PanelTexto[textos.size()];
        for (int i = 0; i < textos.size(); i++) {
            paneles[i]=new PanelTexto(textos.get(i));
            panelPrincipal.add(paneles[i]);
        }
        JButton cerrar=new JButton("Cerrar");
        panelPrincipal.add(cerrar);
        cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventana.dispose();
            }
        });

        ventana.add(panelPrincipal);
        ventana.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }


    public static void main(String[] args) {
        VentanaRepetidas prueba=new VentanaRepetidas(8,"Perico");
        VentanaRepetidas otra=new VentanaRepetidas(Arrays.asList("Pepe","Juan","Antonio"));
    }
}

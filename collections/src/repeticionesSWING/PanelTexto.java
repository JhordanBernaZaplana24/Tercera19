package repeticionesSWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelTexto extends JPanel {
    private String texto;
    JTextField cuadroTexto;

    public PanelTexto(String textoAMostrar) {
        this.texto=textoAMostrar;
        cuadroTexto=new JTextField(20);
        cuadroTexto.setText(texto);
        add(cuadroTexto);
    }

    public void setTexto(String texto) {
        this.texto = texto;
        this.cuadroTexto.setText(texto);
    }

    public String getTexto() {
        return texto;
    }

    public JTextField getCuadroTexto() {
        return cuadroTexto;
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("BOTO_NES");

        frame.setLayout(new GridLayout(0,1));
        frame.add(new PanelTexto("Uno"));
        frame.add(new PanelTexto("Uno"));
        frame.add(new PanelTexto("Uno"));
        frame.add(new PanelTexto("Uno"));
        frame.add(new PanelTexto("Uno"));
        frame.add(new PanelTexto("Uno"));
        frame.add(new PanelTexto("DOs"));
        JButton cerrar=new JButton("Cerrar");
        frame.add(cerrar);
        cerrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

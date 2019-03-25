package repeticionesSWING;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelControl extends JPanel {
    String texto;
    int repeticiones;
    JButton boton = new JButton("Pulsa para repetir");
    JTextField cuadroTexto=new JTextField(20);
    JTextField cuadroRepeticiones=new JTextField(3);

    public PanelControl() {
        setLayout(new GridLayout(0,1));
        add(cuadroTexto);
        add(cuadroRepeticiones);
        add(boton);
        cuadroTexto.setToolTipText("No pasarás");

        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new VentanaRepetidas(
                        Integer.parseInt(cuadroRepeticiones.getText()),
                        cuadroTexto.getText());
            }
        });

    }
}

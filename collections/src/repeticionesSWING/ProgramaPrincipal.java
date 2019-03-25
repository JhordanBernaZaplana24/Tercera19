package repeticionesSWING;

import repeticionesSWING.PanelTexto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaPrincipal {
    static JFrame ventana;
    public static void main(String[] args) {
        ventana=new JFrame("REPETICIONES");
        PanelControl panel=new PanelControl();
        ventana.setLayout(new GridLayout(2,3));

        ventana.add(new PanelControl());
        ventana.add(new PanelControl());
        ventana.add(new PanelControl());
        ventana.add(new PanelControl());
        ventana.add(new PanelControl());
        ventana.add(new PanelControl());

        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
}

package laberinto;

import javax.swing.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Principal {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Expresiones");

        PanelGrafico miPanel=new PanelGrafico();

        //Comprobar lo del tamaño

        ventana.add(miPanel);
        ventana.setResizable(true);
        ventana.setBounds(40,40,350,100);
        ventana.setLocationRelativeTo(null);




        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

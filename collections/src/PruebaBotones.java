import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaBotones {
    public static void main(String[] args) {
        JFrame frame=new JFrame("BOTO_NES");

        JButton boton1=new JButton("Pulsame");
        JButton boton2=new JButton("No me pulses");

        frame.setLayout(new FlowLayout());

        frame.add(boton1);
        frame.add(boton2);

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Bien, me has pulsado");
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"LEE LAS INDICACIONES");
            }
        });


        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

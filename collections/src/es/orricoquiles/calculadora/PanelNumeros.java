package es.orricoquiles.calculadora;

import com.sun.deploy.panel.JavaPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelNumeros extends JavaPanel {

    JButton[] botones=new JButton[10];
    JButton borrar=new JButton("CE");
    JButton igual=new JButton("=");

    JTextField valor=new JTextField("0");


    public PanelNumeros(Calculadora calculadora) {
        valor.setFont(new Font("Arial",Font.ITALIC,48));
        borrar.setFont(new Font("Times",Font.BOLD,48));
        borrar.setForeground(Color.RED);
        igual.setFont(new Font("Times",Font.ITALIC,48));
        igual.setForeground(Color.GREEN);
        this.setBorder(BorderFactory.createTitledBorder("Externo"));
        setLayout(new BorderLayout());
        valor.setHorizontalAlignment(SwingConstants.RIGHT);
        add(valor,BorderLayout.NORTH);
        JPanel panelBotones=new JPanel(new GridLayout(0,3));
        panelBotones.setBorder(BorderFactory.createTitledBorder("NUMEROS"));
        add(panelBotones,BorderLayout.CENTER);
        for (int i = 0; i < botones.length; i++) {
            botones[i]=new JButton(""+i);
            botones[i].setFont(new Font("Courier",Font.BOLD,24));

            botones[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    pulsado(e.getSource());
                }
            });
        }
        panelBotones.add(botones[7]);
        panelBotones.add(botones[8]);
        panelBotones.add(botones[9]);
        panelBotones.add(botones[4]);
        panelBotones.add(botones[5]);
        panelBotones.add(botones[6]);
        panelBotones.add(botones[1]);
        panelBotones.add(botones[2]);
        panelBotones.add(botones[3]);
        panelBotones.add(borrar);
        panelBotones.add(botones[0]);
        borrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                valor.setText("0");
            }
        });
        panelBotones.add(igual);
        igual.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculadora.calcular();
            }
        });
    }

    public void pulsado(Object source) {
        JButton botonPulsado=(JButton) source;
        int valorIntermedio=Integer.valueOf(valor.getText()+botonPulsado.getText());
        valor.setText(""+valorIntermedio);
    }

    public int getValor() {
        return Integer.parseInt(valor.getText());
    }

    public void setValor(int valor) {
        this.valor.setText(""+valor);
    }



}

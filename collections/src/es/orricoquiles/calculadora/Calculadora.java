package es.orricoquiles.calculadora;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Calculadora {
    PanelNumeros panelNumeros;
    PanelOperaciones panelOperaciones;
    Operacion operacionActual=null;

    public Calculadora() {
        this.panelNumeros = new PanelNumeros(this);
        this.panelOperaciones = new PanelOperaciones(this);
    }

    public static void main(String[] args) throws IOException {
        Calculadora calculadora=new Calculadora();
        JFrame frame=new JFrame("BOTONES");
        frame.setLayout(new GridLayout(0,1));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(10,10,300,600);
       // frame.add(new JLabel(new ImageIcon(ImageIO.read(new URL("http://www.uciencia.uma.es/var/ezflow_site/storage/images/media/inventario/imagen/calculadora-mecanica-resulta-9/35090-2-esl-ES/Calculadora-mecanica-Resulta-9_fullinventario.jpg")))));

        frame.add(calculadora.panelNumeros);
        frame.add(calculadora.panelOperaciones);
        frame.setVisible(true);
    }

    public void calcular() {
        if(operacionActual!=null){
            OperacionBinaria real=(OperacionBinaria) operacionActual;
            real.operando2=panelNumeros.getValor();
            panelNumeros.setValor(real.operar());
            operacionActual=null;
        }

    }

    public void operaInicial(Operacion o) {
        if(o instanceof OperacionUnaria){
            o.operando1=panelNumeros.getValor();
            panelNumeros.setValor(o.operar());
        } else {

            if (operacionActual == null) {

                o.operando1 = panelNumeros.getValor();
                operacionActual = o;
                panelNumeros.setValor(0);
            }
        }
    }
}

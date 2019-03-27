package es.orricoquiles.calculadora;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

public class PanelOperaciones extends JPanel {
    Operacion anterior=null;


    public PanelOperaciones(Calculadora calculadora) {
        setLayout(new BorderLayout());
        JTabbedPane pestanyas=new JTabbedPane();

        Map<TipoOperacion,JPanel> paneles=new TreeMap<>();
        for (TipoOperacion tipo :
                TipoOperacion.values()) {
            paneles.put(tipo, new JPanel());
        }

        for (Map.Entry<TipoOperacion, JPanel> entrada :
                paneles.entrySet()){
            pestanyas.addTab(
                    entrada.getKey().name(),
                    entrada.getValue());
        }


        for (Operacion o :
                OperacionesDisponibles.operaciones) {
            paneles.get(o.tipo).add(o.boton);
            o.boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    calculadora.operaInicial(o);
                }
            });
        }
        add(pestanyas,BorderLayout.CENTER);



    }

}

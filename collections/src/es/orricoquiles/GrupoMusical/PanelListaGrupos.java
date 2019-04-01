package es.orricoquiles.GrupoMusical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PanelListaGrupos extends JPanel {
    List<Grupo> elegidos=new ArrayList<>();
    List<Grupo> lista=new ArrayList<>();
    int inicial=0;
    PanelGrupo[] paneles=new PanelGrupo[3];
    JScrollBar barra=new JScrollBar();

    public PanelListaGrupos(String fichero) {
        List<String> lineas= null;
        try {
            lineas = Files.readAllLines(Paths.get("grupos.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Iterator<String> iterador=lineas.iterator();
        while(iterador.hasNext()){
            this.lista.add(new Grupo(
                    iterador.next(),
                    iterador.next(),
                    Integer.parseInt(iterador.next())
            ));
        }
        JPanel listaGrupos=new JPanel(new GridLayout(0,1));
        this.setLayout(new BorderLayout());
        for (int i=0;i<paneles.length;i++){
            paneles[i]=new PanelGrupo();
            listaGrupos.add(paneles[i]);
        }
        actualiza(0);
        add(barra,BorderLayout.EAST);
        add(listaGrupos,BorderLayout.CENTER);
        barra.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                actualiza(e.getValue());
            }
        });


    }

    private void actualiza(int inicial) {
        for (int i = 0; i < paneles.length; i++) {
            if(i<lista.size()) {
                paneles[i].setGrupo(lista.get(i + inicial));
            }
        }
        barra.setUnitIncrement(1);
        barra.setMinimum(0);
        barra.setMaximum(lista.size());
        barra.setVisibleAmount(paneles.length);
    }

    public static void main(String[] args) throws IOException {
        PanelListaGrupos panelListaGrupos=new PanelListaGrupos("grupos.txt");
        JFrame frame=new JFrame("PEPE");
        frame.add(panelListaGrupos);
        frame.setBounds(10,10,650,350);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

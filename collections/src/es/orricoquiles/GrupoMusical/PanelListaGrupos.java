package es.orricoquiles.GrupoMusical;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PanelListaGrupos extends JPanel {
    static List<Grupo> elegidos=new ArrayList<>();
    List<Grupo> lista=new ArrayList<>();
    public static void main(String[] args) throws IOException {
        PanelListaGrupos panelListaGrupos=new PanelListaGrupos();
        List<String> lineas= Files.readAllLines(Paths.get("grupos.txt"));
        Iterator<String> iterador=lineas.iterator();
        while(iterador.hasNext()){
            panelListaGrupos.lista.add(new Grupo(
                    iterador.next(),
                    iterador.next(),
                    Integer.parseInt(iterador.next())
            ));
        }
        JFrame frame=new JFrame();
        JPanel panel=new JPanel();
        panel.setLayout(new GridLayout(0,2));
        for (Grupo g :
                panelListaGrupos.lista) {
            PanelGrupo p=new PanelGrupo(g);
            p.setBounds(0,0,40,40);
            panel.add(p);
            Checkbox c=new Checkbox();
            panel.add(c);
            c.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    notifica(g,e.getStateChange());
                }
            });
        }
        JScrollPane scrollPane=new JScrollPane(panel);
        scrollPane.getVerticalScrollBar().setUnitIncrement(106);
        frame.add(scrollPane);
        frame.setBounds(10,10,640,350);
//        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void notifica(Grupo g, int stateChange) {
//        System.out.println("Pulsado " + g.info() + " con " + stateChange);
        if(stateChange==1){
           elegidos.add(g);
        } else {
            elegidos.remove(g);
        }
        System.out.println("Tienes seleccionados: ");
        for (Grupo grupo :
                elegidos) {
            System.out.println("   " + grupo.info());
        }

    }
}

package es.orricoquiles.GrupoMusical;

import javax.swing.*;
import java.awt.*;

public class NuevoGrupo extends JDialog {
    Grupo g;

    public NuevoGrupo(Frame owner, String title, boolean modal) {
        super(owner, title, modal);


    }

    public static void main(String[] args) {
        PanelGrupo panelGrupo=new PanelGrupo();
        int respuesta=JOptionPane.showConfirmDialog(null, panelGrupo, "NUEVO GRUPO", JOptionPane.YES_OPTION);
        while(respuesta != 1){
            if(panelGrupo.getGrupo()==null){
                respuesta=JOptionPane.showConfirmDialog(null, panelGrupo, "NUEVO GRUPO", JOptionPane.YES_OPTION);
            } else {
                System.out.println(panelGrupo.getGrupo());
                break;
            }
        }
    }
}

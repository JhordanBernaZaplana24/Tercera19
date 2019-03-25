package laberinto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.util.ArrayList;
import java.util.List;

public class PanelGrafico extends JPanel{
    List<Punto> pulsados=new ArrayList<>();
    boolean pulsadoRaton=false;



    public PanelGrafico() {
        setDoubleBuffered(true);
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
                super.mouseDragged(e);
//                System.out.println(e.getX());
                if(pulsadoRaton){
                    pinta(e);
                }
            }

            @Override
            public void mouseMoved(MouseEvent e) {
                super.mouseMoved(e);
//                System.out.println(e.getX());
                if(pulsadoRaton){
                    pinta(e);
                }
            }
        });
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                pulsadoRaton=true;
//                System.out.println("A");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                pulsadoRaton=false;
//                System.out.println("E");
            }
        });
    }

    private void pinta(MouseEvent e) {
//        System.out.println(e.getX());
//        System.out.println(e.getY());
        pulsados.add(new Punto(e.getX(),e.getY()));
        paint(this.getGraphics());
    }

    @Override
    public void update(Graphics g) {
        super.update(g);
        paint(g);
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Color antiguo=g.getColor();
        for (Punto p :
                pulsados) {

            g.setColor(p.color);

            g.fillOval(p.x,p.y,8,8);
//            System.out.println(p);
        }
    }
}

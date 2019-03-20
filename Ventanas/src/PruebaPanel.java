import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PruebaPanel {
    static ArrayList<Monumento> lista=new ArrayList<>();
    static int pos=0;
    static PanelMonumento miPanelMonumento;
    public static void main(String[] args) {

        lista.add(new Monumento("Estatua Libertad","XX",TipoMonumento.ESTATUA,200));
        lista.add(new Monumento("Estatua de La mano que escribe","XX",TipoMonumento.ESTATUA,20));
        lista.add(new Monumento("Estatua de Cibeles","XVIII",TipoMonumento.ESTATUA,30));
        lista.add(new Monumento("Edificio Chrisler","XIX",TipoMonumento.EDIFICIO,320));

        JFrame miFrame=new JFrame("Mi Ventana");
        miFrame.setLayout(new BorderLayout());
        miPanelMonumento=new PanelMonumento();

        miFrame.add(miPanelMonumento.getPanel(),BorderLayout.CENTER);

        JPanel botones=new JPanel(new FlowLayout());
        miFrame.add(botones, BorderLayout.SOUTH);
        JButton adelante=new JButton("-->");
        JButton atras=new JButton("<--");
        botones.add(atras);
        botones.add(adelante);

        atras.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pos--;
                actualiza();
            }
        });

        adelante.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pos++;
                actualiza();
            }
        });


        miFrame.pack();
        miFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miFrame.setLocationRelativeTo(null);
        miFrame.setVisible(true);

        actualiza();

    }

    private static void actualiza() {
        miPanelMonumento.setMonumento(lista.get(pos));
    }
}

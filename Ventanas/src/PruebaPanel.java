import javax.swing.*;

public class PruebaPanel {
    public static void main(String[] args) {
        JFrame miFrame=new JFrame("Mi Ventana");
        PanelMonumento miPanelMonumento=new PanelMonumento();

        miFrame.add(miPanelMonumento.getPanel());


        miFrame.pack();
        miFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miFrame.setLocationRelativeTo(null);
        miFrame.setVisible(true);
    }
}

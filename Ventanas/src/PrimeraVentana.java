import javax.swing.*;

public class PrimeraVentana {
    public static void main(String[] args) {
        JFrame miFrame=new JFrame("Mi Ventana");

        JPanel panel=new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder("Ventanica"));

        panel.add(new JLabel("Etiqueta"));
        panel.add(new JLabel("Etiqueta"));
        panel.add(new JLabel("Etiqueta"));
        panel.add(new JLabel("Etiqueta"));
        panel.add(new JLabel("Etiqueta"));


        miFrame.add(panel);

        miFrame.pack();
        miFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        miFrame.setLocationRelativeTo(null);
        miFrame.setVisible(true);
    }
}

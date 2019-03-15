import javax.swing.*;
import java.awt.*;

public class PanelMonumento {
    private final JTextField nombre;
    private final JTextArea historia;
    private JPanel panel;
    private final JComboBox<String> siglo;


    public PanelMonumento() {
        this.panel = new JPanel(new GridLayout(0,2));
        panel.setBorder(BorderFactory.createTitledBorder("Monumento"));
        panel.add(new JLabel("Nombre:"));
        nombre=new JTextField(20);
        panel.add(nombre);
        panel.add(new JLabel("Historia:"));
        historia=new JTextArea(5,5);
        historia.setLineWrap(true);
        JScrollPane scroll = new JScrollPane (historia,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

        historia.setFont(new Font("Century Schoolbook L",Font.ITALIC,24));

        panel.add(scroll);
        panel.add(new JLabel("Siglo:"));
        siglo=new JComboBox<>();
        siglo.addItem("XX");
        siglo.addItem("XIX");
        siglo.addItem("XVIII");
        siglo.addItem("XVII");
        siglo.addItem("XVI");
        siglo.addItem("XV");
        siglo.addItem("Muy antiguo");
        siglo.setFont(new Font("Courier 10 Pitch",Font.BOLD,30));
        panel.add(siglo);



    }

    public JPanel getPanel() {
        return this.panel;
    }
}

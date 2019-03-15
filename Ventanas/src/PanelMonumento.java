import javax.swing.*;
import java.awt.*;

public class PanelMonumento {
    private final JTextField nombre;
    private final JTextArea historia;
    private JPanel panel;
    private final JComboBox<String> siglo;

    private Monumento monumento;


    public PanelMonumento() {
        GridBagConstraints gbc1=new GridBagConstraints();
        GridBagConstraints gbc2=new GridBagConstraints();
        GridBagConstraints gbc3=new GridBagConstraints();
        GridBagConstraints gbc4=new GridBagConstraints();
        GridBagConstraints gbc5=new GridBagConstraints();
        GridBagConstraints gbc6=new GridBagConstraints();

        gbc1.insets=new Insets(5,5,5,5);
        gbc2.insets=new Insets(5,5,5,5);
        gbc3.insets=new Insets(5,5,5,5);
        gbc4.insets=new Insets(5,5,5,5);
        gbc5.insets=new Insets(5,5,5,5);
        gbc6.insets=new Insets(5,5,5,5);


        gbc1.gridx=0;
        gbc1.gridy=0;
        gbc1.anchor=GridBagConstraints.NORTHEAST;

        gbc2.gridx=1;
        gbc2.gridy=0;

        gbc3.gridx=0;
        gbc3.gridy=1;
        gbc3.anchor=GridBagConstraints.NORTHEAST;

        gbc4.gridx=1;
        gbc4.gridy=1;
        gbc4.fill=GridBagConstraints.BOTH;

        gbc5.gridx=0;
        gbc5.gridy=2;
        gbc5.anchor=GridBagConstraints.EAST;

        gbc6.gridx=1;
        gbc6.gridy=2;
        gbc6.anchor=GridBagConstraints.WEST;

        this.panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Monumento"));

        panel.add(new JLabel("Nombre:"),gbc1);
        nombre=new JTextField(30);
        panel.add(nombre,gbc2);
        panel.add(new JLabel("Historia:"),gbc3);
        historia=new JTextArea(5,5);
        historia.setLineWrap(true);
        JScrollPane scroll = new JScrollPane (historia,
                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
                JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

//        historia.setFont(new Font("Century Schoolbook L",Font.ITALIC,24));

        panel.add(scroll,gbc4);
        panel.add(new JLabel("Siglo:"),gbc5);
        siglo=new JComboBox<>();
        siglo.addItem("XX");
        siglo.addItem("XIX");
        siglo.addItem("XVIII");
        siglo.addItem("XVII");
        siglo.addItem("XVI");
        siglo.addItem("XV");
        siglo.addItem("Muy antiguo");
//        siglo.setFont(new Font("Courier 10 Pitch",Font.BOLD,30));
        panel.add(siglo,gbc6);




    }

    public JPanel getPanel() {
        return this.panel;
    }

    public void setMonumento(Monumento m){
        this.monumento=m;
        this.nombre.setText(m.getNombre());
        this.historia.setText(m.getDescripcion());
        this.siglo.setSelectedItem(m.getSiglo());
    }
}

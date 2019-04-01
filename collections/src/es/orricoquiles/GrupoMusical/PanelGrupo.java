package es.orricoquiles.GrupoMusical;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.List;

public class PanelGrupo extends JPanel{
    public static final Font FUENTE_GRANDE = new Font("Arial", Font.PLAIN, 20);
    JTextField nombre=new JTextField(10);
    JTextField hit=new JTextField(10);
    JTextField ventas=new JTextField(10);

    PanelGrupo(){
        inicializar();
    }

    PanelGrupo(Grupo g){
        inicializar();
        this.setGrupo(g);
    }
    private void inicializar() {
        List<Component> visibles=new ArrayList<>();
        visibles.add(new JLabel("Nombre del Grupo"));
        visibles.add(nombre);
        visibles.add(new JLabel("Hit: "));
        visibles.add(hit);
        hit.setCaretPosition(0);
        visibles.add(new JLabel("Ventas: "));
        visibles.add(ventas);
        for (Component c :
                visibles) {
            add(c);
        }
        ponFuente(visibles, FUENTE_GRANDE);
        setLayout(new GridLayout(0,2));
        setBorder(BorderFactory.createTitledBorder("GRUPO MUSICAL"));
    }

    private void ponFuente(List<Component> visibles, Font fuente) {
        for (Component c :
                visibles) {
            c.setFont(fuente);
        }
    }

    public Grupo getGrupo(){

        try {
            Grupo salida = new Grupo(
                    nombre.getText(),
                    hit.getText(),
                    Integer.parseInt(ventas.getText()));
            return salida;
        } catch (IllegalArgumentException iae){
            JOptionPane.showMessageDialog(null,iae.getMessage(),"ERROR",JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
    public void setGrupo(Grupo grupo){
        this.nombre.setText(grupo.getNombre());
        this.hit.setText(grupo.getHit());
        hit.setCaretPosition(0);
        this.ventas.setText(""+grupo.getVentasMundiales());

    }
    public void vaciaPanel(){
        this.nombre.setText("");
        this.hit.setText("");
        this.ventas.setText("");
    }

    public static void main(String[] args) {
        JFrame frame=new JFrame("GRUPO");
        frame.setLayout(new GridLayout(0,1));
        PanelGrupo panelGrupo=new PanelGrupo(new Grupo("ABBA","WATERLOO",40));
        frame.add(panelGrupo);
        JButton crear=new JButton("Crear");
        frame.add(crear);
        crear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(panelGrupo.getGrupo().info());
            }
        });
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

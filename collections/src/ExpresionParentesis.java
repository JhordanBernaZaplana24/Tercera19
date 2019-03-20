import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ExpresionParentesis {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Expresiones");

        PanelPropio miPanel=new PanelPropio();

        //Comprobar lo del tamaño

        ventana.add(miPanel.getPanel());
        ventana.setResizable(false);
        ventana.setBounds(40,40,350,100);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
}

class PanelPropio{
    JLabel etiqueta=new JLabel("Expresion:");
    JTextField texto=new JTextField(20);
    JButton comprobar=new JButton("comprobar");
    JLabel salida=new JLabel("Cadena vacía");

    JPanel panel=new JPanel();

    public PanelPropio() {
        this.panel.add(etiqueta);
        this.panel.add(texto);
//        this.panel.add(comprobar);
        this.panel.add(salida);

        texto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                super.keyReleased(e);
                pulsadoBoton();
            }
        });
        texto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsadoBoton();
            }
        });

        comprobar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pulsadoBoton();
            }
        });


    }

    private void pulsadoBoton() {
        String salida=valida(texto.getText())?"Es válida":"No es válida";
//        JOptionPane.showMessageDialog(null,salida);
        this.salida.setText(salida);
    }

    private static boolean valida(String expresion) {
        Deque<Character> pila = new LinkedList<>();
        char[] caracteres = expresion.toCharArray();
        for (char c :
                caracteres) {
            if (c == '(') {
                pila.push('*');
            } else if (c == ')') {
                try {
                    pila.pop();
                } catch (NoSuchElementException nsee){
                    return false;
                }
            }
        }
        return pila.isEmpty();
    }

    public JTextField getTexto() {
        return texto;
    }

    public JPanel getPanel() {
        return panel;
    }
}
import javax.swing.*;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class EjemploPila {
    public static void main(String[] args) {
        String aProbar="(([]))";
        Deque<Character> pila=new LinkedList<>();
        try {
            for (int i = 0; i < aProbar.length(); i++) {
                if (aProbar.charAt(i) == '(') {
                    pila.push('%');
                } else if (aProbar.charAt(i) == ')') {
                    pila.pop();
                }
                String salida = "Estoy mirando: " + aProbar.substring(0, i + 1) + "\n";
                for (Character c :
                        pila) {
                    salida += "\n" + c;
                }
                JOptionPane.showMessageDialog(null, salida);
            }
        } catch (NoSuchElementException noSuchElementException){
            System.out.println("ERROR");
        }
        if(!pila.isEmpty()){
            System.out.println("ERROR");
        }

    }
}

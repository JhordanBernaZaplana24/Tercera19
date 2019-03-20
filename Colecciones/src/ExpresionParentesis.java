import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class ExpresionParentesis {
    public static void main(String[] args) {
        String expresion = "-guiones- .una -frase \"literal\"-.";
        System.out.println(valida(expresion) ? "Es válida" : "Es incorrecta");
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
}

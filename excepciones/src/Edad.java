import javax.swing.*;

public class Edad {
    public static void main(String[] args) {

        pideEdad();

    }
    public static int pideEdad() {
        int edad=0;
        while(true) {
            try {String respuesta=JOptionPane.showInputDialog("Tu edad?");
                edad = Integer.parseInt(respuesta);
                if(edad==0){
                    System.out.println("Cero de edad no tiene sentido");
                } else {
                    return edad;
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: No se ha entendido como un número");
                System.out.println("Ha pasado algo muy malo");
            }
            finally {
                System.out.println("Esto pasa siempre por aquí");
            }
        }
    }
}

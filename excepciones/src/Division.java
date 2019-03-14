import javax.swing.*;

public class Division {

    public static void main(String[] args) {
        String num1= JOptionPane.showInputDialog("Num");
        String num2=JOptionPane.showInputDialog("Den");
        try {
            divide(num1, num2);
            //300 cosas más con los números que me han pasado
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    private static void divide(String s, String s1) throws Exception {
        int num;
        int den;

        try {
            num = Integer.parseInt(s);
        } catch (NumberFormatException nfe){
            throw new Exception("Error en el numerador");
        }
        try{

            den=Integer.parseInt(s1);
        } catch (NumberFormatException nfe){
            throw new Exception("Error en el denominador");
        }

        try{
            System.out.println(num / den);
        } catch (ArithmeticException afe){
            throw new Exception("cero abajo");
        }
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticaDivision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean salir=false;
        while(!salir){
            try {
                System.out.print("Introduzca el numerador: ");
                String entrada=sc.nextLine();
                if(entrada.charAt(0)=='q' || entrada.charAt(0)=='Q'){
                    salir=true;
                    continue;
                }
                int numerador = Integer.parseInt(entrada);
                System.out.print("Introduzca el denominador: ");
                entrada=sc.nextLine();
                int denominador = Integer.parseInt(entrada);
                int division = numerador / denominador;
                System.out.println(numerador + " / " + denominador + " es " + division);
            } catch (NumberFormatException nfe){
                System.out.println(nfe.getMessage());
                System.out.println("Has introducido datos erróneos");
                System.out.println("Try again");
            } catch (ArithmeticException ae){
                System.out.println("No puedes dividir por cero");
            }


        }

    }
}

/*
 Enhance the DivisionPractice program from the chapter:

    Put in a loop so that the user is repeatedly asked for the numerator and the divisor. For each set of data, the program prints out the result, or an informative error message if there is a problem (division by zero or poor input data).
    The program continues looping, even if there is a problem
    Exit the loop when data entered for the numerator start with characters "q" or "Q". Don't print out an error message in this case.
    Don't ask for the divisor if the user just asked to quit.

Here is sample output from one run:

Enter the numerator: 12
Enter the divisor:  4
12 / 4 is 3

Enter the numerator: 12
Enter the divisor  : 0
You can't divide 12 by 0

Enter the numerator: glarch
You entered bad data.
Please try again.

Enter the numerator: quit

You will need to use the method charAt() from the String class.
 */
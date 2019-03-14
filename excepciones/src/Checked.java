import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Checked {
    public static void main(String[] args) throws IOException {
        divide();
        leeFichero();
    }

    private static void leeFichero() throws IOException {
        String nombre= JOptionPane.showInputDialog("Fichero");
        try {
            leelineas(nombre);
        } catch (NoSuchFileException nsfe) {
            System.out.println("EL FICHERO NO EXISTE");
        } catch (IOException ioe){
            System.out.println("ERROR. NO SÉ LO QUE HA PASADO CON EL FICHERO");
            System.out.println("Prueba tu con trim");
            throw new IOException();
        }
    }

    private static void leelineas(String s) throws IOException {
            List<String> lineas = Files.readAllLines(Paths.get(s));
    }

    private static void divide() {
        divideEnteros(2,3);
    }

    private static void divideEnteros(int i, int i1) {
        System.out.println(i / i1);
    }
}

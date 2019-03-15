import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Carrera2 {
        public static void main(String[] args) throws
                ExcepcionDepositoVacio,
                IOException {
            Coche ford=new Coche("AAA8888");
            int vueltas=30;
            for (int i = 0; i < vueltas; i++) {
                ford.recorre(40);
                ford.repostar();
                Files.readAllLines(Paths.get("texto.txt"));
                System.out.println(ford);
            }
        }

}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Mapas {
    public static void main(String[] args) throws IOException {
        Map<Character,Integer> apariciones=new TreeMap<>();
        List<String> lineas= Files.readAllLines(Paths.get("quijote.txt"));
        for (String l :
                lineas) {
//            System.out.println(l);
            for (Character c :
                    l.toCharArray()) {
                if(apariciones.containsKey(c)){
                    apariciones.put(c,apariciones.get(c)+1);
                } else {
                    apariciones.put(c, 1);
                }
            }
        }

//        Set<Character> claves=apariciones.keySet();
//        for (char c :
//                claves) {
//            System.out.println(c +"-"+ apariciones.get(c));
//        }

        for (Map.Entry<Character,Integer> entrada:
             apariciones.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

    }
}

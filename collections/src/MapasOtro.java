import java.util.*;

public class MapasOtro {

    public static void main(String[] args) {
        Map<String,Integer> contactos=new HashMap<>();
        contactos.put("ana",6697797);
        contactos.put("beatriz",6666666);
        contactos.put("lola",7777777);
        contactos.put("delia",868686);
        Set<String> nombres=new TreeSet<>(new ComparaLongitud());
        nombres.addAll(contactos.keySet());
        for (String s :
                nombres) {
            System.out.println(s + " - " + contactos.get(s));
        }

    }
}

class ComparaLongitud implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}

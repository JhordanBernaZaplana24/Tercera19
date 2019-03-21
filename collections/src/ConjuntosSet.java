import java.util.*;

public class ConjuntosSet {
    public static void main(String[] args) {
        List<Integer> lista= new ArrayList<>();
        lista.add(3);
        lista.add(5);
        lista.add(6);
        if(!lista.contains(3)) {
            lista.add(3);
        }
        lista.add(2);
        lista.add(1);
        lista.add(3);
        Iterator<Integer> it=lista.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("-----------------");
        Set<Integer> conjunto=new HashSet<>();
        conjunto.add(3);
        conjunto.add(-5);
        conjunto.add(6);
        conjunto.add(0);
        conjunto.add(4);
        conjunto.add(43);
        conjunto.add(-2);
        conjunto.add(2);
        conjunto.add(2);
        conjunto.add(1);
        conjunto.add(3);


        Iterator<Integer> it2=conjunto.iterator();
        while(it2.hasNext()){
            System.out.println(it2.next());
        }

    }
}

import java.util.*;

public class Ambulatorio {
    public static void main(String[] args) {
        PriorityQueue<Caso> doctor=new PriorityQueue<>(new Comparator<Caso>() {
            @Override
            public int compare(Caso o1, Caso o2) {
                return o1.gravedad-o2.gravedad;
            }
        });
        doctor.add(new Caso("Ana",4));
        doctor.add(new Caso("Bea",1));
        doctor.add(new Caso("Clara",2));
        doctor.add(new Caso("Delia",3));
        doctor.add(new Caso("Elena",4));
        doctor.add(new Caso("Flori",1));
        Iterator<Caso> iterator=doctor.iterator();
        while(iterator.hasNext()){
            Caso actual=iterator.next();
            System.out.println("Gravedad: " + actual.gravedad + " -" + actual.paciente);
        }
    }
}
class Caso implements Comparable<Caso>{
    String paciente;
    int gravedad;

    public Caso(String paciente, int gravedad) {
        this.paciente = paciente;
        this.gravedad = gravedad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public int getGravedad() {
        return gravedad;
    }

    public void setGravedad(int gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Caso o) {
        return Integer.compare(this.gravedad,o.gravedad);
    }
}

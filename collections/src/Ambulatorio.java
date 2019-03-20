import java.util.*;

public class Ambulatorio {
    public static void main(String[] args) {
        PriorityQueue<Caso> doctor=new PriorityQueue<>();
        doctor.add(new Caso("Ana", Gravedad.COMERCIAL));
        doctor.add(new Caso("Bea",Gravedad.URGENCIA));
        doctor.add(new Caso("Clara",Gravedad.PREGUNTICA));
        doctor.add(new Caso("Delia",Gravedad.PACIENTE));
        doctor.add(new Caso("Elena",Gravedad.PACIENTE));
        doctor.add(new Caso("Flori",Gravedad.URGENCIA));//que listo es esto
//        Iterator<Caso> iterator=doctor.iterator();
//        while(iterator.hasNext()){
//            Caso actual=iterator.next();
//            System.out.println("Gravedad: " + actual.gravedad + " -" + actual.paciente);
//        }
        while(!doctor.isEmpty()){
            Caso actual=doctor.remove();
            System.out.println("Gravedad: " + actual.gravedad + " -" + actual.paciente);
        }
    }
}

enum Gravedad {
    COMERCIAL(4),URGENCIA(1),PACIENTE(3),PREGUNTICA(2);

    private final int orden;

    public int getOrden() {
        return orden;
    }

    Gravedad(int i) {
        this.orden=i;
    }
}
class Caso implements Comparable<Caso>{
    String paciente;
    Gravedad gravedad;

    public Caso(String paciente, Gravedad gravedad) {
        this.paciente = paciente;
        this.gravedad = gravedad;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public Gravedad getGravedad() {
        return gravedad;
    }

    public void setGravedad(Gravedad gravedad) {
        this.gravedad = gravedad;
    }

    @Override
    public int compareTo(Caso o) {
        return Integer.compare(this.gravedad.getOrden(),o.gravedad.getOrden());
    }
}


import java.util.Objects;

public class MarcaAgua {
    String nombre;
    double mineralizacion;
    Valoracion valoracion;

    public MarcaAgua(String nombre, double mineralizacion, Valoracion valoracion) {
        this.nombre = nombre;
        this.mineralizacion = mineralizacion;
        this.valoracion = valoracion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarcaAgua)) return false;
        MarcaAgua marcaAgua = (MarcaAgua) o;
        return Objects.equals(nombre, marcaAgua.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String info(){
        return nombre+" "+this.valoracion.getS();
    }

    @Override
    public String toString() {
        return "MarcaAgua{" +
                "nombre='" + nombre + '\'' +
                ", mineralizacion=" + mineralizacion +
                ", valoracion=" + valoracion +
                '}';
    }
}

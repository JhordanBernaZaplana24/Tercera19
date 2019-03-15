public class Monumento implements Comparable<Monumento>{
    private final String nombre;
    private final String descripcion;
    private final String siglo;
    private final TipoMonumento tipo;


    private final int alturaMetros;

    public Monumento(String nombre, String siglo, TipoMonumento tipo, int alturaMetros) {
        this.nombre = nombre;
        this.descripcion = null;
        this.siglo = siglo;
        this.tipo = tipo;
        this.alturaMetros = alturaMetros;
    }

    @Override
    public String toString() {
        return "Monumento{" +
                "nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", siglo='" + siglo + '\'' +
                ", tipo=" + tipo +
                ", alturaMetros=" + alturaMetros +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getSiglo() {
        return siglo;
    }

    public TipoMonumento getTipo() {
        return tipo;
    }

    public int getAlturaMetros() {
        return alturaMetros;
    }

    @Override
    public int compareTo(Monumento o) {
        return this.nombre.compareTo(o.nombre);
    }
}

package es.orricoquiles.GrupoMusical;

import java.util.Objects;

public class Grupo {
    private final String nombre;
    private final String hit;
    private final int ventasMundiales;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grupo)) return false;
        Grupo grupo = (Grupo) o;
        return Objects.equals(nombre, grupo.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    public String getNombre() {
        return nombre.toUpperCase();
    }

    public String getHit() {
        return hit.toUpperCase();
    }

    public int getVentasMundiales() {
        return ventasMundiales;
    }

    public Grupo(String nombre, String hit, int ventasMundiales) {
        this.nombre = nombre;
        this.hit = hit;
        if(ventasMundiales<=0){
            throw new IllegalArgumentException("Las ventas tienen que ser mayores que 0");
        }
        if(nombre.equals("")){
            throw new IllegalArgumentException("El nombre no puede estar vacío");

        }
        if(hit.equals("")){
            throw new IllegalArgumentException("El HIT no puede estar vacío");

        }
        this.ventasMundiales = ventasMundiales;
    }

    @Override
    public String toString() {
        return "Grupo{" +
                "nombre='" + nombre + '\'' +
                ", hit='" + hit + '\'' +
                ", ventasMundiales=" + ventasMundiales +
                '}';
    }

    public String info(){
        String salida="";
        salida+=this.getHit()+" - "+this.getNombre()+" Ventas: "+this.getVentasMundiales();
        return salida;
    }
}

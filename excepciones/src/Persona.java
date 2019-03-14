public class Persona {
    String nombre;
    int edad;

    public Persona(String nombre, int edad)  {
        if(nombre.contains("0123456789-$%")){
            throw new IllegalArgumentException("El nombre no es admisible");
        }
        if(edad<0 || edad>120){
            throw new IllegalArgumentException("La edad no es posible");
        }
        this.nombre = nombre;
        this.edad = edad;
    }
}

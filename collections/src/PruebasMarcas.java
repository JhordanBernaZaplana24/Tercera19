import java.util.*;

public class PruebasMarcas {
    public static void main(String[] args) {
        Set<MarcaAgua> marcas=new HashSet<>();
        marcas.add(new MarcaAgua("FontBella",2.0,Valoracion.MALA));
        marcas.add(new MarcaAgua("Bezoya",1.0,Valoracion.BUENA));
        marcas.add(new MarcaAgua("Lanjarón",3.0,Valoracion.REGULAR));
        marcas.add(new MarcaAgua("Solán de Cabras",2.5,Valoracion.BUENA));
        marcas.add(new MarcaAgua("Bezoya",1.0,Valoracion.BUENA));

        for (MarcaAgua m :
                marcas) {
            System.out.println(m.info());
        }
        //¿Está Bezoya?
        if(marcas.contains(new MarcaAgua("Bezoya",0.0,null))){
            System.out.println("Sí está Bezoya");
        } else {
            System.out.println("No está Bezoya");
        }

    }
}

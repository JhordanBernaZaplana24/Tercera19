package es.orricoquiles.romanos;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ConversorRomanos {
    public static String convertir(List<Simbolos> lista){
        int resultado=0;
        Simbolos ultimo=null;
        for (Simbolos s :
                lista) {
            if(ultimo!=null && s.compareTo(ultimo)>0){
                resultado-=2*ultimo.getValor();
            }
            resultado += s.getValor();

            ultimo=s;
        }

        return ""+resultado;
    }

    public static String convertir(String numero){
        List<Simbolos> lista=new ArrayList<>();
        try {
            for (char c :
                    numero.toCharArray()) {
                lista.add(Simbolos.valueOf("" + Character.toUpperCase(c)));
            }
        } catch (IllegalArgumentException iae){
            return "Número romano no reconocido";
        }
        return convertir(lista);
    }


    public static void main(String[] args) {
        System.out.println(convertir("MCII"));
    }
}

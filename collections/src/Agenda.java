import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Agenda {
    String nombre;
    Map<String, List<String>> agenda;

    public Agenda(String nombre) {
        this.nombre = nombre;
        agenda=new HashMap<>();
    }

    public void addPersonaSiNoExiste(String persona){
        if(!agenda.containsKey(persona)){
            agenda.put(persona,new ArrayList<>());
        }
    }

    public void addDato(String persona,String dato){
        addPersonaSiNoExiste(persona);
        List<String> datos=agenda.get(persona);
        datos.add(dato);
    }

    public String info(){
        String salida="";
        salida+=this.nombre+"\n";
        salida+="----------------------------\n";
        for (Map.Entry<String, List<String>> entrada :agenda.entrySet()
                ) {
            salida+=entrada.getKey()+"\n";
            for (String s :
                    entrada.getValue()) {
                salida+="        * ";
                salida+=s+"\n";
            }

        }
        return salida;
    }

}

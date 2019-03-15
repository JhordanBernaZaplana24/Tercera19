public class Coche {
    private final String matricula;

    private int autonomia;

    public Coche(String matricula) {
        if(matricula.length()!=7 && matricula.length()!=8){
            throw new IllegalArgumentException("Longitud de la matrícula incorrecta");
        }
        autonomia=750;
        this.matricula = matricula;
    }

    public void recorre(int kilometros) throws ExcepcionDepositoVacio {
        if(autonomia<kilometros){
            throw new ExcepcionDepositoVacio("El depósito no llega");
        }
        autonomia-=kilometros;


        System.out.println("Recorro " + kilometros + " km");
    }
    public  void repostar() throws ExcepcionDepositoVacioConFuga {
        autonomia=750;
        autonomia--;
        if(autonomia!=750){
            throw new ExcepcionDepositoVacioConFuga("Tiene fuga");
        }
    }

    @Override
    public String toString() {
        return matricula + '\'' +
                ", autonomia=" + autonomia;
    }
}

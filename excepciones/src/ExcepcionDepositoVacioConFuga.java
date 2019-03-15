public class ExcepcionDepositoVacioConFuga extends ExcepcionDepositoVacio {
    public ExcepcionDepositoVacioConFuga(String message) {
        super(message);
        System.out.println("Cuidado que tiene fuga");
    }
}

public class Carrera {
    public static void main(String[] args) {
        Coche ford=new Coche("AAA8888");
        int vueltas=30;
        for (int i = 0; i < vueltas; i++) {
            try {
                ford.recorre(70);
            } catch (ExcepcionDepositoVacio edv){
                try {
                    ford.repostar();
                } catch (ExcepcionDepositoVacioConFuga excepcionDepositoVacioConFuga) {
                    System.out.println("Paro la carrera por fugas");
                    break;
                }
            }
            System.out.println(ford);
        }
    }
}

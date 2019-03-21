public class PruebaAgenda {
    public static void main(String[] args) {
        Agenda telefono=new Agenda("Teléfono");
        telefono.addDato("Ana","teléfono:66688686");
        telefono.addDato("Ana","edad:27");
        telefono.addDato("Ana","Tiene dos hijos");
        telefono.addDato("Bea","No tiene hijos");
        telefono.addDato("Bea","Edad:86");
        telefono.addDato("Bea","teléfono:686");
        telefono.addDato("Clara","teléfono:111111111");
        System.out.println(telefono.info());
    }
}

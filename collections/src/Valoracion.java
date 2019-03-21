public enum Valoracion {
    BUENA("*****"),
    REGULAR("***"),
    MALA("*"),
    ;

    private final String s;

    public String getS() {
        return s;
    }

    Valoracion(String s) {
        this.s=s;
    }
}

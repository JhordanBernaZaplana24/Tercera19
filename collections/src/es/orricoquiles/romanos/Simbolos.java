package es.orricoquiles.romanos;

public enum Simbolos {
    I(1),
    V(5),
    X(10),
    L(50),
    C(100),
    D(500),
    M(1000);

    private final int valor;

    public int getValor() {
        return valor;
    }

    Simbolos(int i) {
        this.valor=i;
    }
}

//
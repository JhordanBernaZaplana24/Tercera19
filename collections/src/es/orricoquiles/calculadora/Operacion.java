package es.orricoquiles.calculadora;

import javax.swing.*;

public abstract class Operacion {
    int operando1;
    String etiqueta;
    JButton boton;
    TipoOperacion tipo;

    public Operacion(String etiqueta,TipoOperacion tipo) {
        this.etiqueta = etiqueta;
        boton=new JButton(etiqueta);
        this.tipo=tipo;
    }

    public abstract int operar();
}

abstract class OperacionUnaria extends Operacion{

    public OperacionUnaria(String etiqueta,TipoOperacion tipoOperacion) {
        super(etiqueta,tipoOperacion);
    }
}

abstract class OperacionBinaria extends Operacion{
    int operando2;


    public OperacionBinaria(String etiqueta,TipoOperacion t) {
        super(etiqueta,t);
    }
}

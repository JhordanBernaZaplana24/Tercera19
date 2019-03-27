package es.orricoquiles.calculadora;

import java.util.ArrayList;
import java.util.List;

import static es.orricoquiles.calculadora.TipoOperacion.ARITMETICAS;
import static es.orricoquiles.calculadora.TipoOperacion.CONVERSION;
import static es.orricoquiles.calculadora.TipoOperacion.INFORMATICAS;

public class OperacionesDisponibles {
    static List<Operacion> operaciones=new ArrayList<>();
    static {
        operaciones.add(new OperacionBinaria("+", ARITMETICAS) {
            @Override
            public int operar() {
                return operando1+operando2;
            }
        });
        operaciones.add(new OperacionBinaria("-",ARITMETICAS) {
            @Override
            public int operar() {
                return operando1-operando2;
            }
        });
        operaciones.add(new OperacionBinaria("Potencia",ARITMETICAS) {
            @Override
            public int operar() {
                return (int) Math.floor(Math.pow(operando1,operando2));
            }
        });
        operaciones.add(new OperacionUnaria("+/-",ARITMETICAS) {
            @Override
            public int operar() {
                return operando1*-1;
            }
        });
        operaciones.add(new OperacionUnaria("X²",ARITMETICAS) {
            @Override
            public int operar() {
                return operando1*operando1;
            }
        });
        operaciones.add(new OperacionUnaria("Mb->Kb",CONVERSION) {
            @Override
            public int operar() {
                return operando1*1024;
            }
        });
        operaciones.add(new OperacionBinaria("XOR",INFORMATICAS) {
            @Override
            public int operar() {
                return operando1^operando2;
            }
        });
        operaciones.add(new OperacionUnaria("Millas a metros",CONVERSION) {
            @Override
            public int operar() {
                return operando1*1600;
            }
        });

    }
}

package com.RAAL.x00032219;

public final class Moneda {
    private Moneda(){
    }

    public static double Contador(int tipo, double cont){
        switch(tipo){
            case 1:
                cont+=0.05;
                return cont;
            case 2:
                cont+=0.10;
                return cont;
            case 3:
                cont+=0.25;
                return cont;
            case 4:
                cont+=1.00;
                return cont;
            default:
                return 0;
        }
    }
}

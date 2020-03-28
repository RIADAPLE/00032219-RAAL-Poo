package com.RAAL.x00032219;

public final class RegistroDeTiempo {

    private RegistroDeTiempo () {}

    public static int Cálculo(String horaE,String salida){
        int horas1=0,horas2=0, minutosaux1=0,minutosaux2=0, minutos1=0,minutos2=0, minutosfinal=0;
        horas1 = Integer.parseInt(horaE.substring(0,2));
        horas2 = Integer.parseInt(salida.substring(0,2));

        minutos1 = Integer.parseInt(horaE.substring(3,5));
        minutos2 = Integer.parseInt(salida.substring(3,5));
        minutosaux1 = horas1*60;
        minutosaux2 = horas2*60;

        minutos1+=minutosaux1;
        minutos2+=minutosaux2;

        minutosfinal=minutos2-minutos1;

        return minutosfinal;

    }
}

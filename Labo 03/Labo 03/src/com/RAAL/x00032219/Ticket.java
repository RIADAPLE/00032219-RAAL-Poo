package com.RAAL.x00032219;

public class Ticket {
    private String placa;
    private String horaE;

    public Ticket(String placa,String horaE){
        this.placa = placa;
        this.horaE = horaE;
    }

    public String getHoraE() {
        return horaE;
    }

    public String getPlaca() {
        return placa;
    }

    @Override
    public String toString() {
        return "\nParqueo" +
                "\nHora de entrada = " + horaE +
                "\n Placa = " + placa +
                "\n";
    }
}

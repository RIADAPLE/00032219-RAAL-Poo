package com.RAAL.x00032219;


public class Herramientas {
    private String material;
    private String tipo;
    private int danio;
    private int integridad;
    private byte eficiencia;

    public Herramientas(String material, String tipo, byte eficiencia){
        this.material = material;
        this.tipo = tipo;
        this.eficiencia = eficiencia;
        danio=0;
        integridad=0;
        if(material.equals("piedra")){
            danio+=2;
            integridad+=15;
        }
        else if(material.equals("oro")){
            danio+=3;
            integridad+=20;
        }
        else if(material.equals("hierro")){
            danio+=4;
            integridad+=25;
        }
        else if(material.equals("diamante")){
            danio+=5;
            integridad+=40;
        }
        else{
            danio+=1;
            integridad+=10;
        }
        if(tipo.equals("espada")){
            danio+=10;
        }
        else if(tipo.equals("pico")){
            danio+=4;
        }
        else if(tipo.equals("azada")){
            danio+=3;
        }
        else if(tipo.equals("hacha")){
            danio+=5;
        }
        else if(tipo.equals("pala")){
            danio+=1;
        }

    }

    public String gettipo(){
        return tipo;
    }
    public int getvida(){
        return integridad;
    }

    public void ataque(){
        System.out.println("Has hecho "+danio+" de daño con una "+tipo+" de "+material);
        if(material.equals("piedra")){
            integridad-=4;
        }
        else if(material.equals("oro")){
            integridad-=3;
        }
        else if(material.equals("hierro")){
            integridad-=2;
        }
        else if(material.equals("diamante")){
            integridad-=1;
        }
        else{
            integridad-=5;
        }
    }



    public void reparar(){
        if(material.equals("piedra")){
            integridad=15;
        }
        else if(material.equals("oro")){
            integridad=20;
        }
        else if(material.equals("hierro")){
            integridad=25;
        }
        else if(material.equals("diamante")){
            integridad=40;
        }
        else{
            integridad=10;
        }
    }

    @Override
    public String toString() {
        return "\nHerramienta" +
                "\nmaterial = " + material +
                "\n tipo = " + tipo +
                "\n daño = " + danio +
                "\n integridad = " + integridad +
                "\n eficiencia = " + eficiencia+"\n";
    }
}

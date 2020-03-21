package com.RAAL.x00032219;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Herramientas> herra = new ArrayList<>();
	    Scanner her = new Scanner(System.in);
	    String material, tipo;
	    byte op1=0, op2=0,efi;
        do{
        if(herra==null){
        }
        else{
            herra.forEach(s-> {if(s.getvida()==0){
                System.out.println("\nSe rompió la herramienta siguiente: ");
                System.out.println(s.toString());}
            });
            herra.removeIf(s -> s.getvida()==0);
        }
        menu();
        op1=her.nextByte(); her.nextLine();
        switch(op1){
            case 1:
                System.out.println("Material: "); material = her.nextLine();
                System.out.println("Tipo: "); tipo = her.nextLine();
                System.out.println("Eficiencia(1-10): "); efi = her.nextByte(); her.nextLine();
                material.toLowerCase();
                tipo.toLowerCase();
                herra.add(new Herramientas(material,tipo,efi));
                break;
            case 2:
                herra.forEach(herramientas -> System.out.println(herra.toString()));
                break;
            case 3:
                System.out.println("Tipo: "); tipo = her.nextLine();

                for(Herramientas trabherra : herra){
                    if(trabherra.gettipo().equals(tipo)){
                        System.out.println(trabherra.toString());
                    }
                }
                break;
            case 4:
                System.out.println("Has atacado con todas tus armas");
                herra.forEach(Herramientas::ataque);
                break;
            case 5:
                System.out.println("Todas tus herramientas han sido separadas!");
                herra.forEach(Herramientas::reparar);
                break;
        }
        }while(op1!=0);

    }

    public static void menu(){
        System.out.println("1. Agregar herramienta a la lista.");
        System.out.println("2. Consultar herramientas.");
        System.out.println("3. Consultar herramientas de un tipo.");
        System.out.println("4. Atacar.");
        System.out.println("5. Reparar");
        System.out.println("0. Salir.");
    }
}

//System.out.println("Agregue una herramienta para empezar");
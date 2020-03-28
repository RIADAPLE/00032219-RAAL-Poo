package com.RAAL.x00032219;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner pal = new Scanner(System.in);
        System.out.println("Introduzca una palabra:");
        String kk = pal.nextLine();

        kk.toLowerCase();
        Boolean palin=true;

        for (int i=0;i<kk.length();i++){
            if(kk.charAt(i)==kk.charAt(((kk.length())-i)-1));
            else{
                palin=false;}

        }
        if(palin==true){
            System.out.println("Es palíndrome");
        }
        else{
            System.out.println("No es palíndrome");
        }
    }
}
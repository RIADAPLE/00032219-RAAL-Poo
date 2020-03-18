package com.RAAL.x00032219;

import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        ArrayList<Character> vocales = new ArrayList<>();
        Scanner pal = new Scanner(System.in);
        int n=0;
        char c='\0';
        System.out.print("Digite cuantos letras quiere ingresar: ");
        n=pal.nextInt();pal.nextLine();
        for(int i=0;i<n;i++){
            System.out.println("Letra "+(i+1)+": ");
            c=pal.next().charAt(0);pal.nextLine();
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U'){
                vocales.add(c);
            }
        }
        System.out.println("Las vocales que se ingresaron fueron las siguientes: " + vocales);
    }
}
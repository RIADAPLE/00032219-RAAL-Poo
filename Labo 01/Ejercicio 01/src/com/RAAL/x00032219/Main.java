package com.RAAL.x00032219;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Inroduzca cuantos números de la secuencia de fibonacci, quiere que salgan:");
        int n = en.nextInt();
        int total=1,ant=1,antt=0;


        for(int i=0;i<n;i++){
            if(i==0)
                System.out.println(i);
            else if(i==1)
                System.out.println(i);
            else{
                total=ant+antt;
                System.out.println(total);
                antt=ant;
                ant=total;
            }

        }
    }
}
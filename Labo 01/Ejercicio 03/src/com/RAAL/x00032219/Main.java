package com.RAAL.x00032219;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduzca hasta que número se repetirá la secuencia");
        Scanner ent = new Scanner(System.in);
        int n = ent.nextInt();
        boolean f=true;
        recursión(1,n,f);
    }

    static void recursión(int x, int n, boolean f){
        if(f==true && x==n){
               System.out.println(n);
               f=false;
               recursión(x,n,f);
           }
        else if(f==true){
            System.out.println(x);
            x++;
            recursión(x,n,f);
        }
        else if(f==false){
            if(x==1){
                return;
            }
            else{
            x--;
            System.out.println(x);
            recursión(x,n,f);}

        }
        else
            return;
    }
}

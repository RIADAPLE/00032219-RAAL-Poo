package com.RAAL.x00032219;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner pal = new Scanner(System.in);
	System.out.println("Introduzca una palabra:");
	String pala = pal.nextLine();

        System.out.println(pala.replace('a','b'));
    }
}

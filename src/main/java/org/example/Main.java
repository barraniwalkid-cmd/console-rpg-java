package org.example;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){


        System.out.println("Bienvenue dans le Mini RPG");
        System.out.println("Veuiller entre un nom");
        Scanner scan = new Scanner(System.in);


        Hero heros = new Hero(scan.nextLine());
        heros.displayStatus();








    }
}

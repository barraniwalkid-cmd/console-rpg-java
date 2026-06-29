package org.example;
import java.util.Scanner;

public class Menutest {
    int nombre = 0 ;

    public void affichemenu(){
        while(nombre!=3){
            System.out.println("====MENU====");
            System.out.println("=====HERO=====");
            System.out.println("====QUITER=====");
            Scanner scan = new Scanner(System.in);
            nombre = scan.nextInt();

            switch (nombre){
                case 1 : System.out.println("menu");
                break;
                case 2 : System.out.println("hero");
                break;
                case 3 : System.out.println("quiter");
                break;
                default:System.out.println("faux");

            }





        }

    }


}

package org.example;
import java.util.Scanner;

public class MenuExercices {
    int nombre =0;

    public void afficheMenu(){
        while(nombre!=4){
           System.out.println("=====Menue====");
           System.out.println("=====Iventaire====");
           System.out.println("======Hero======");
           System.out.println("====QUITER====");
           Scanner scan = new Scanner(System.in);
           nombre = scan.nextInt();
           switch (nombre){
               case 1 : System.out.println("MENU");
               break;
               case 2 : System.out.println("Iventaire");
               break;
               case 3 : System.out.println("Hero");
               break;
               case 4 : System.out.println();
               default : System.out.println("faux");
           }



        }
    }






}

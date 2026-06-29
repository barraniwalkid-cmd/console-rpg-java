package org.example;
import java.util.Scanner;

public class Menu {
    public void afficheMenu(){
        int nombre = 0;
        while (nombre!=6){


        System.out.println("=======MENU======");
        System.out.println("1 . Créer un héros");
        System.out.println("2 . Voir mon héros");
        System.out.println("3 . Explore");
        System.out.println("4 . Combatre");
        System.out.println("5 . Inventaire");
        System.out.println("6 . Quitter");
        Scanner choix = new Scanner(System.in);
        System.out.println("Choisissez une option : ");
        nombre = choix.nextInt();

        switch(nombre){

            case 1 : System.out.println("=====Créer votre Héros====");
            break;
            case 2 : System.out.println("===== Voir votre Héros====");
            break;
            case 3 : System.out.println("===== Parter a L'aventure=====");
            break;
            case 4 : System.out.println("=====Combatre=====");
            break;
            case 5 : System.out.println("=====Iventaire=====");
            break;
            case 6 : System.out.println("=====Aurevoir=====");
            break;
            default:System.out.println("Choix Invalide entre 1 et 6 ");

        }
        }

    }
}

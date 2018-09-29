package com.example.tp1;

import java.util.Scanner;
/*on importe le scanner qui récupère les entrées clavier*/

/**
 * Created by geii on 17/09/2018.
 */

public class exo5 {

    public static void main(String[] args) {

        int a, b, op, resul;
        /*on définit les variables*/

        Scanner scan = new Scanner(System.in);
        /*on initialise le scanner*/
        System.out.println("Calculatrice V3.0");
        System.out.println("Valeur de a = ");
        a = scan.nextInt();
        /*on récupère a*/
        System.out.println("Valeur de b = ");
        b = scan.nextInt();
        /*on récupère b*/
        System.out.println("Operation : ");
        op = scan.nextInt();
        /*on récupère op*/
        switch (op) {
            case 1: /*on vérifie que op est bien égal à 1*/

                resul = a + b;
                System.out.println("Addition a+b = ");
                System.out.println(resul);
            /*on affiche le résultat de a+b*/
                break;
            case 2:
                /*on vérifie que op est bien égal à 1*/

                resul = a - b;
                System.out.println("Soustraction a-b = ");
                System.out.println(resul);
            /*on affiche le résultat de a-b*/
                break;
            case 3:
                /*on vérifie que op est bien égal à 3*/

                resul = a * b;
                System.out.println("Multiplication a*b = ");
                System.out.println(resul);
            /*on affiche le résultat de a*b*/
                break;
            case 4:
                /*on vérifie que op est bien égal à 4*/
                if (b == 0) {
                    System.out.println("Erreur : division par 0");
                    /*si b est égal à 0, on indique l'erreur*/
                }else{
                    resul = a/b;
                    System.out.println("Division entiere a div b = ");
                    System.out.println(resul);
                    /*on affiche le résultat  de a/b*/
                }
                break;
            case 5:
                /*on vérifie que op est bien égal à 5*/
                if(b==0){
                    System.out.println("Erreur : division par 0");
                    /*si b est égal à 0, on indique l'erreur*/
                }else{
                    resul = a % b;
                    System.out.println("Modulo a mod b = ");
                    System.out.println(resul);
                    /*on affiche le résultat  de a%b*/
                }
                break;
            default:
                    System.out.println("Pas d'operations");
                    /*op n'est pas 1, 2, 3, 4 ou 5, aucune opération*/

    }
    }

}

package com.example.tp3;

import java.util.Scanner;

public class exo1 {

    public static int carre(int x){
        return x*x;
    }

    public static int cube(int x){
        return x*x*x;
    }

    public static int premier(int x) {
        int i, reste;
        if (x == 1) {
            return 0;
        } else if (x == 2) {
            return 1;
        } else {
            i = 2;
            do {
                reste = x % i;
                i = i + 1;
            } while (!(reste == 0 || i == x));
            return reste;
        }
    }

    public static void main(String[] args) {

        int a, resul;
        char op, choix;
        /*on définit les variables*/

        Scanner scan = new Scanner(System.in);
        /*on initialise le scanner*/
        System.out.println("Calculatrice2 V1.0");
        do {/*boucle do while pour effectuer une action jusqu'à une détection pour resssortir de celle-ci*/
            System.out.println("Valeur de a = ");
            a = scan.nextInt();
            /*on récupère a*/
            do {
                System.out.println("Operation : ");
                op = scan.next().charAt(0);
                /*on récupère op*/
            }while (!(op=='2' || op=='3' || op=='*' || op=='p' || op=='P'));
            /*tant que op n'est pas égal à + ou - ou * ou / ou m*/
            if(op=='p'){
                op='P';
            }
            switch (op) {/*boucle switch pour tester si plusieurs cas de valeurs entrées*/
                case '2':
                    /*on vérifie que op est bien égal à 1*/

                    resul = carre(a);
                    System.out.println("carré de a = ");
                    System.out.println(resul);
                    /*on affiche le résultat de a+b*/
                    break;/*on termine le switch*/
                case '3':
                    /*on vérifie que op est bien égal à 1*/

                    resul = cube(a);
                    System.out.println("cube de a = ");
                    System.out.println(resul);
                    /*on affiche le résultat de a-b*/
                    break;
                case 'P':
                    /*on vérifie que op est bien égal à P*/
                    if(a<=0){
                        System.out.println("a doit etre positif");
                    }
                    resul = premier(a);
                    if (resul==0){
                        System.out.println("a n'est pas un nombre premier");
                    }else{
                        System.out.println("a est un nombre premier");
                    }
                    break;

            }
            do {
                System.out.println("Autre opération ?");
                choix = scan.next().charAt(0);
                /*on récupère choix*/
            }while (!(choix=='O' || choix=='o' || choix=='N' || choix=='n'));
            /*tant que choix n'est pas égal à O ou o ou N ou n*/

        }while (!(choix=='N' || choix=='n'));
        /*tant que choix n'est pas égal à N ou n*/

    }

}

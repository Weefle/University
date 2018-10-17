package com.example.tp3;

import java.util.Scanner;

public class exo1 {

    /*
    les fonctions suivantes seront déclarées comme privées
    car on n'aura pas besoin d'y accéder dans une autre classe
     */

    /*declaration de la fonction carre*/
    private static int carre(int x){
        return x*x;
        /*la fonction carre retourne un entier*/
    }

    private static int cube(int x){
        return x*x*x;
        /*la fonction cube retourne un entier*/
    }

    private static int premier(int x) {
        int i, reste;
        /*on definit les variables pour cette fonction*/
        if (x == 1) {
            /*on verifie que x et bien egal à 1*/
            return 0;
            /*on retourne la valeur 0*/
        } else if (x == 2) {
            /*on verifie que x et bien egal à 2*/
            return 1;
            /*on retourne la valeur 1*/
        } else {
            i = 2;
            do {
                reste = x % i;
                i = i + 1;
            } while (!(reste == 0 || i == x));
            /*on effectue la boucle tant que reste
             n'est pas egal à 0 ou i n'est pas egal à x*/
            return reste;
            /*la fonction premier retourne un entier*/
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
            }while (!(op=='2' || op=='3' || op=='p' || op=='P'));
            /*tant que op n'est pas égal à 2 ou 3 ou p ou P*/
            if(op=='p'){
                op='P';
                /*si op est p, celui-ci est reconverti en P*/
            }
            switch (op) {/*boucle switch pour tester si plusieurs cas de valeurs entrées*/
                case '2':
                    /*on vérifie que op est bien égal à 2*/

                    resul = carre(a);
                    /*on appelle la fonction carre*/
                    System.out.println("carré de a = ");
                    System.out.println(resul);
                    /*on affiche le résultat du carre de a*/
                    break;/*on termine le switch*/
                case '3':
                    /*on vérifie que op est bien égal à 3*/

                    resul = cube(a);
                    /*on appelle la fonction cube*/
                    System.out.println("cube de a = ");
                    System.out.println(resul);
                    /*on affiche le résultat du cube de a*/
                    break;
                case 'P':
                    /*on vérifie que op est bien égal à P*/
                    if(a<=0){
                        System.out.println("a doit etre positif");
                    }else{
                        resul = premier(a);
                        /*on appelle la fonction premier*/
                        if (resul==0){
                            System.out.println("a n'est pas un nombre premier");
                        }else{
                            System.out.println("a est un nombre premier");
                        }
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

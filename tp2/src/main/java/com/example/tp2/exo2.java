package com.example.tp2;

        import java.util.Scanner;
/*on importe le scanner qui récupère les entrées clavier*/

public class exo2 {

    public static void main(String[] args) {

        int a, b, resul;
        char op, choix;
        /*on définit les variables*/

        Scanner scan = new Scanner(System.in);
        /*on initialise le scanner*/
        System.out.println("Calculatrice V4.0");
        do {/*boucle do while pour effectuer une action jusqu'à une détection pour resssortir de celle-ci*/
            System.out.println("Valeur de a = ");
            a = scan.nextInt();
            /*on récupère a*/
            System.out.println("Valeur de b = ");
            b = scan.nextInt();
            /*on récupère b*/
            do {
                System.out.println("Operation : ");
                op = scan.next().charAt(0);
                /*on récupère op*/
            }while (!(op=='+' || op=='-' || op=='*' || op=='/' || op=='m'));
            /*tant que op n'est pas égal à + ou - ou * ou / ou m*/
            switch (op) {/*boucle switch pour tester si plusieurs cas de valeurs entrées*/
                case '+':
                    /*on vérifie que op est bien égal à +*/

                    resul = a + b;
                    System.out.println("Addition a+b = ");
                    System.out.println(resul);
                    /*on affiche le résultat de a+b*/
                    break;/*on termine le switch*/
                case '-':
                    /*on vérifie que op est bien égal à -*/

                    resul = a - b;
                    System.out.println("Soustraction a-b = ");
                    System.out.println(resul);
                    /*on affiche le résultat de a-b*/
                    break;
                case '*':
                    /*on vérifie que op est bien égal à **/

                    resul = a * b;
                    System.out.println("Multiplication a*b = ");
                    System.out.println(resul);
                    /*on affiche le résultat de a*b*/
                    break;
                case '/':
                    /*on vérifie que op est bien égal à /*/
                    if (b == 0) {
                        System.out.println("Erreur : division par 0");
                        /*si b est égal à 0, on indique l'erreur*/
                    } else {
                        resul = a / b;
                        System.out.println("Division entiere a div b = ");
                        System.out.println(resul);
                        /*on affiche le résultat  de a/b*/
                    }
                    break;
                case 'm':
                    /*on vérifie que op est bien égal à m*/
                    if (b == 0) {
                        System.out.println("Erreur : division par 0");
                        /*si b est égal à 0, on indique l'erreur*/
                    } else {
                        resul = a % b;
                        System.out.println("Modulo a mod b = ");
                        System.out.println(resul);
                        /*on affiche le résultat  de a%b*/
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

    }}

package com.example.tp4;

import java.util.Scanner;
//on importe la classe Scanner

public class exo1 {

    //fonction principale
    public static void main(String[] args){
        float somme, moyenne; //on déclare
        int i, j;       //ici nos
        char choix;   //variables
        float[] note = new float[10]; //déclaration d'un tableau de 10 réels
        Scanner sc = new Scanner(System.in); //importation du Scanner

        System.out.println("Calcul d'une moyenne de 10 notes maximum:");
        i=0; //on initialise i à 0
        do{
            do {
                System.out.print("note");
                System.out.print(i+1); //on affiche la note i+1
                System.out.print(" = ");
                note[i] = sc.nextFloat(); //on récupère la note et on l'ajoute à l'index de notre tableau
            }while(!(note[i]>=0 && note[i]<=20));//on répète tant que la note à l'index n'est pas plus grande ou égale à 0
            //ou plus petite ou égale à 20
            i++;//on incrémente i
            do {
                System.out.println("Autre note ? ");
                choix = Character.toUpperCase(sc.next().charAt(0)); //on change le caractère en majuscule
            }while (!(choix=='O' || choix=='N')); //on répète tant que le choix n'est pas O ou N ou o ou n
        }while (!(choix=='N' || i==10)); //on répète tant que le choix n'est pas N ou n ou que l'index i n'est pas égal à 10
        somme = 0; //on initialise somme à 0
        for(j=0;j<=i-1;j++){  //boucle pour de 0 à i-1
            somme = somme + note[j]; //on additionne les notes à la somme
        }
        moyenne = somme/i; //on calcule la moyenne des notes
        System.out.println("Moyenne = " + moyenne); //on affiche la moyenne
    }

}

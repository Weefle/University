package com.example.td2;

import java.util.Scanner;

public class exo5 {

    public static void conv1(int valeurTest, int longueurBinaire){

        // Affichage sur 64 Bits;
        // Valeurs décimale positive la plus grande sur un ordinateur 64 Bits avec une JVM 64 Bits et en ne travaillant qu'avec les types primaires : 9007199254740991
        // En effet, si on se limite aux types primaires (int, double, float, long), on se limite aux 53 premiers de nos 64 bits.
        // Pour aller plus loin, il faut abandonner les types primaires ainsi que java.lang.Math et travailler avec les classes de java.math
        char resultat[] = new char[longueurBinaire];
        for (int i = 0 ; i < resultat.length ; i++) resultat[i] = '0';// On rempli notre tableau de caractères de '0', cela correspond à la valeur décimale 0.
        String resultatFinal;
        if (valeurTest > 0) { // Inutile de faire quoi que ce soit si la valeur vaut 0, notre tableau de caractères est déjà rempli pour ça.
            double valeur = valeurTest;
            for (int rang = resultat.length-1 ; rang >= 0 ; rang--) {
                if (Math.pow(2, rang) <= valeur) {
                    resultat[resultat.length-1-rang] = '1';
                    valeur -= Math.pow(2, rang);
                }
            }
        }
        resultatFinal = new String(resultat);
        System.out.println(valeurTest + " donne en binaire sur " + longueurBinaire + " Bits : " + resultatFinal);

    }

    public static void main(String args[]) {
        int nb, nb1;

        System.out.println("conversion binaire");
        do {
            System.out.print("nombre= ");
            Scanner scan = new Scanner(System.in);
            nb=scan.nextInt();
            System.out.print("bits= ");
            nb1=scan.nextInt();
        }while(!(nb>=0 || nb1>=0));
        System.out.print("Resultat: ");
        conv1(nb, nb1);
    }
}


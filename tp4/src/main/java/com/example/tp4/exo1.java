package com.example.tp4;

import java.util.Scanner;

public class exo1 {

    public static void main(String[] args){
        float somme, moyenne;
        int i, j;
        char choix;
        float[] note = new float[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Calcul d'une moyenne de 10 notes maximum");
        i=0;
        do{
            do {
                System.out.print("note");
                System.out.print(i+1);
                System.out.print(" = ");
                note[i] = sc.nextFloat();
            }while(!(note[i]>=0 && note[i]<=20));
            i++;
            do {
                System.out.println("Autre note ? ");
                choix = Character.toUpperCase(sc.next().charAt(0));
            }while (!(choix=='O' || choix=='N'));
        }while (!(choix=='N' || i==10));
        somme = 0;
        for(j=0;j<=i-1;j++){
            somme = somme + note[j];
        }
        moyenne = somme/i;
        System.out.println("Moyenne = " + moyenne);
    }

}

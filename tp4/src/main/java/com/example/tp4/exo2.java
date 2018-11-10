package com.example.tp4;

import java.util.Scanner;
//on importe la classe Scanner

public class exo2 {

    //fonction retournant une chaîne de caractères
    public static String decimal2hex(int d) {
        char[] digits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};//on déclare notre tableau de digits avec l'hexadécimal
        int base = 16;   // on définit sur une base de 16
        String hex = "";// on initialise la variable chaîne hex
        while (d > 0) {//on répète tant que d est supérieur strict à 0
            int digit = d % base;  // on initialise digit en faisant le modulo du nombre saisi par la base
            hex = digits[digit] + hex;  // on change la variable hex en additionnant l'index digit du tableau digits avec hex
            d = d / base; //on change d par d divisé par la base
        }
        return hex;//on retourne hex
    }

    //fonction principale
    public static void main(String[] args){
        int d;//on déclare d
        Scanner sc = new Scanner(System.in);//on récupère le Scanner
        do {
            System.out.println("Entrer un nombre entier sur 32 bits : ");
            d = sc.nextInt();//on récupère le nombre
        }while(!(d>=0));//on répète tant que d<=0
        System.out.print(decimal2hex(d));//on affiche le résultat en hexadécimal

    }

}

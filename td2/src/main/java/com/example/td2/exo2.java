package com.example.td2;

import java.util.Scanner;

public class exo2 {

public static int facto(int entier){

int resultat, i;
i=1;
resultat=1;
while(i<=entier){

    resultat=resultat*i;
    i=i+1;
}
return resultat;

}

public static void main(String[] args){

    int result;

    System.out.println("Entrer un nombre: ");
    do{
        Scanner scan = new Scanner(System.in);
        result = scan.nextInt();
    }while (!(result>=0));
    System.out.print("La factorielle de " + result + " est : " + facto(result));

}

}

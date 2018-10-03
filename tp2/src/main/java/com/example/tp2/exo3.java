package com.example.tp2;

public class exo3 {

    public static void main(String[] args){
        int i;
        int j;
        /*on initialise les variables i et j sans valeur particulière car la boucle for va s'en occuper*/
        for(i=1;i<9;i++) {
            /*on execute tant que i est inférieur a 9 et on l'incrémente de 1*/
            for(j=0;j<i;j++) {
                /*on execute tant que j est inférieur a i et on l'incrémente de 1*/
                System.out.print("+");
                /*on ajoute un plus si j<i*/
            }
            /*pas besoin de remettre j à 0 comme avec la boucle while*/
            System.out.println("");
            /*on saute une ligne si j<i
            puis on reprend la première boucle for*/
            /*le maximum de + affichés est de 8*/
        }


    }

}

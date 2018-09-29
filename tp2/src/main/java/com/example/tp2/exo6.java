package com.example.tp2;

public class exo6 {

    public static void main(String[] args){
        int i;
        int j;
        i=1;
        j=0;
        /*on initialise les variables i et j et on leur attribue des valeurs*/
        while (i<10) {
            /*on execute tant que i est inférieur a 10*/
            while (j<i) {
                /*on execute tant que j est inférieur a i*/
                System.out.print("+");
                /*on ajoute un plus si j<i*/
                j++;

            }
            j=0;
            /*remise à zéro de la valeur j*/
            System.out.println("");
            /*on saute une ligne si j<i
            puis on incrémente i pour continuer
            sur la même ligne ensuite
            et reprendre la boucle while*/
            i++;
        }
        /*le maximum de + affichés est de 9*/

    }

}

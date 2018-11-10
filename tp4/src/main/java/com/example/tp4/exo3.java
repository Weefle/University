package com.example.tp4;

public class exo3 {

    //fonction principale
    public static void main(String[] args){
        char[][] ecran = new char[15][40];//on initialise un tableau de 15 lignes et 40 colonnes
        int i, i2; //on initialise
        int i3 = 18; //nos
        int i4 = 22;  //variables
        for(i=0;i<11;i++){//pour i de 0 à 10 on a la hauteur du triangle
            i3++; // on incrémente i3
            i4--; //on décrémente i4
            for(i2=39;i2>2;i2--){ // pour i2 de 39 à 3 on a la largeur du triangle

                if(i4<i2 && i3>i2){
                    ecran[i][i2] = '+';
                }else{                   //si on est dans l'intervalle du triangle on défini '+' sinon on défini ' '
                    ecran[i][i2] = ' ';
                }

            }
        }

        for(i=10;i<15;i++){ //pour i de 10 à 15 on a la hauteur du carré
            for(i2=0;i2<40;i2++){ //pour i2 de 0 à 40 on a la largeur du carré
                if(i2>17 && i2<23){
                    ecran[i][i2] = '+';
                }else{                   //si on est dans l'intervalle du carré on défini '+' sinon on défini ' '
                    ecran[i][i2] = ' ';
                }
            }
        }

        for(i=0;i<15;i++){ //pour i de 0 à 15 on prend la hauteur totale de la flèche
            for(i2=3;i2<40;i2++){ //pour i2 de 3 à 40 on prend la largeur totale de la flèche
                System.out.print(ecran[i][i2]); //on affiche le contenu total de nos tableaux

            }

            System.out.println(" "); // on n'oublie pas le saut de ligne sinon notre flèche s'étend en largeur
        }


    }

}

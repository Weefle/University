package com.example.td2;

import java.util.Scanner;

public class exo4 {

    public static void conv1(int x){
        int i, j;
        j=128;
        for (i=0;i<8;i++){

            if(x>=j){
                System.out.print('1');
                x=x-j;
            }else{
                System.out.print('0');
            }
            j=j/2;
        }



    }

    public static void main(String[] args){

        int nb;

        System.out.println("conversion binaire");
        do {
            System.out.print("nb= ");
            Scanner scan = new Scanner(System.in);
            nb=scan.nextInt();
        }while(!(nb>=0));
        System.out.print("Resultat: ");
        conv1(nb);

    }
}

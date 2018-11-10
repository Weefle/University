package com.example.tp4;

public class Test {

    public static void main(String[] args){
        char[][] ecran = new char[15][40];
        int i=0;
        int j=0;
        while (i<10) {
            while (j<i) {
                ecran[i][j]='+';
                j++;

            }
            j=0;
            ecran[i][j]=' ';
            i++;
        }

        while(i<15){
            while(j<5){
                ecran[i][j]='+';
                j++;
            }
            j=0;
            ecran[i][j]=' ';
            i++;
        }



        for(i=0;i<15;i++) {


            for (j = 0; j < 40; j++) {

                System.out.print(ecran[i][j]);

            }

            System.out.println(" ");
        }

    }

}

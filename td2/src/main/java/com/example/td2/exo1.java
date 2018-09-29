package com.example.td2;

public class exo1 {

    public static void tempo(long x){

        while(x!=0){

            x--;

        }

    }

    public static void main(String[] args){

        long reglage_tempo;
        System.out.print("l'informatique c'est trop ");
        reglage_tempo=5000000000L;
        tempo(reglage_tempo);
        System.out.println("fantastique !");
        System.out.print("reglage tempo : " + reglage_tempo);

    }

}

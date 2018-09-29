package com.example.td2;

public class exo3 {

    public static double carre(double x){

        return x*x;

    }

    public static double section_tube(double diametre){
        double section;
        section = Math.PI*carre(diametre)/4;
        return section;

    }

    public static double volume_tube(double diametre, double longueur){
        double volume;
        volume = longueur*section_tube(diametre);
        return volume;

    }

    public static void main(String[] args){

        double s, v;
        s=section_tube(5.31);
        v=volume_tube(8.64,65.6);
        System.out.println("La section du tube 1 est : " + s);
        System.out.print("Le volume du tube 2 est : " + v);

    }

}

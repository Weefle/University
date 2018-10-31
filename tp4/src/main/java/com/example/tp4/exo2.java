package com.example.tp4;

import java.util.Scanner;

public class exo2 {

    // condition: il faut que d>0
    public static String decimal2hex(int d) {
        char[] digits = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        if (d <= 0) return "0";
        int base = 16;   // flexible to change in any base under 16
        String hex = "";
        while (d > 0) {
            int digit = d % base;              // rightmost digit
            hex = digits[digit] + hex;  // string concatenation
            d = d / base;
        }
        return hex;
    }

    public static void main(String[] args){
        int d;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Entrer un nombre entier sur 32 bits : ");
            d = sc.nextInt();
        }while(d==0);
        System.out.print(decimal2hex(d));

    }

}

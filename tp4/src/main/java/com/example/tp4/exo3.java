package com.example.tp4;

public class exo3 {

    public static void main(String[] args){
        char[][] ecran = new char[16][41];
        int i, i2;
        int i3 = 18;
        int i4 = 22;
        for(i=0;i<11;i++){
            i3++;
            i4--;
            for(i2=39;i2>2;i2--){

                if(i4<i2 && i3>i2){
                    ecran[i][i2] = '+';
                }else{
                    ecran[i][i2] = ' ';
                }

            }
        }

        for(i=10;i<15;i++){
            for(i2=0;i2<40;i2++){
                if(i2>17 && i2<23){
                    ecran[i][i2] = '+';
                }else{
                    ecran[i][i2] = ' ';
                }
            }
        }

        for(i=0;i<16;i++){
            for(i2=3;i2<41;i2++){
                System.out.print(ecran[i][i2]);

            }

            System.out.println(" ");
        }


    }

}

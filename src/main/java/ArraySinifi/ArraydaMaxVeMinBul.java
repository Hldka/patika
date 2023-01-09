package ArraySinifi;

import java.util.Scanner;

public class ArraydaMaxVeMinBul {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }}
            System.out.println("Minimum Değer " + min);
            System.out.println("Maximum Değer " + max);
            System.out.println("****************************");

            int [] arr={15,12,788,1,-1,-778,2,0};
            Scanner scan=new Scanner(System.in);
            System.out.println("Lüfen bir sayi giriniz ...");
            int say=scan.nextInt();
            int min1=0;
            int max1=0;
            for (int w:arr) {

             if (say>w){if ((say-w)<min1){min1=w;}}else
             {if ((w-say)<max1){max1=w;}}
            }
            System.out.println("Girilen en kücük en yakin sayi : "+min1);
            System.out.println("Girilen en Büyük en yakin sayi : "+max1);

        }



    }


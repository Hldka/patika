package Döngüler;

import java.util.Scanner;

public class PrimZahlen {
    //1bis 100 primzahlen schreiben
    public static void main(String[] args) {
        primZahlen();
    }

    private static void primZahlen() {

        for (int i=1;i<=100;i++){
            int sayac=0;
            for (int j=1;j<=i;j++){if (i%j==0){sayac++;}}if (sayac==2){
                System.out.print(i+" ");
            }

        }
    }
}

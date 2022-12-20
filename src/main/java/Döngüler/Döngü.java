package Döngüler;

import java.util.Scanner;

public class Döngü {
    /*
    * Java döngüler ile 0'dan girilen sayıya kadar olan
    * sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int counter=0;
        int tplm=0;
        int say= scan.nextInt();
        for (int i=0;i<=say;i++){
            if (i%3==0&& i%4==0){
                tplm=tplm+i;
                counter++;

            }
        }
        System.out.println(tplm/counter);
    }
}

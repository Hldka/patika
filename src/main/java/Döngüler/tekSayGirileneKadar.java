package Döngüler;

import java.util.Scanner;

public class tekSayGirileneKadar {
    /*Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
    girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n ;
        int sum=0;

        do {
            System.out.println("Lütfen bir sayi giriniz...");
            n=scan.nextInt();
            if (n%4==0){sum+=n;}
        }while (n%2!=1);
        System.out.println(sum);




    }
}

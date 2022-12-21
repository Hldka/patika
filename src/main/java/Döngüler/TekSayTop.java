package Döngüler;

import java.util.Scanner;
//döngüler ile negatif bir deger girilene kadar kullanicidan girisleri kabul eden girilen tek sayilari ekrana basan program yapiniz

public class TekSayTop {
    public static void main(String[] args) {
        int n;
        int sum=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("sayi giriniz");
            n=scan.nextInt();
            if (n%2==1){
        sum+=n;}
        }while (n>0);
        System.out.println("Toplam : "+sum);
    }
}

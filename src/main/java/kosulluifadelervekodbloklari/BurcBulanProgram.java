package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("dogdugunuz ayi sayi olarak giriniz...");
       int  mont=scan.nextInt();
        System.out.println("dogdugunuz sayi olarak giriniz günü giriniz...");
        int day=scan.nextInt();
        burcbul(mont,day);
    }public static void burcbul(int mont,int day ){


        if (mont==1){if (day>=1 && day <31){
            if (day<23){
                System.out.println(" burcunuz Oglak ");
            }else System.out.println("burcunuz Kova");
        }}
        if (mont==2){if (day>=1 && day <29){
            if (day<20){
                System.out.println(" burcunuz Kova ");
            }else System.out.println("burcunuz Balik");
        }}
        if (mont==3){if (day>=1 && day <31){
            if (day<21){
                System.out.println(" burcunuz Balik ");
            }else System.out.println("burcunuz Kova");
        }}
        if (mont==4){if (day>=1 && day <31){
            if (day<22){
                System.out.println(" burcunuz Kova ");
            }else System.out.println("burcunuz Boga");
        }}
        if (mont==5){if (day>=1 && day <31){
            if (day<23){
                System.out.println(" burcunuz Boga ");
            }else System.out.println("burcunuz ikizler");
        }}
        if (mont==6){if (day>=1 && day <31){
            if (day<23){
                System.out.println(" burcunuz Ikizler ");
            }else System.out.println("burcunuz Yengec");
        }}
        if (mont==7){if (day>=1 && day <31){
            if (day<24){
                System.out.println(" burcunuz Yengec ");
            }else System.out.println("burcunuz Aslan");
        }}
        if (mont==8){if (day>=1 && day <31){
            if (day<24){
                System.out.println(" burcunuz Aslan ");
            }else System.out.println("burcunuz Basak");
        }}
        if (mont==9){if (day>=1 && day <31){
            if (day<24){
                System.out.println(" burcunuz Basak ");
            }else System.out.println("burcunuz Terazi");
        }}
        if (mont==10){if (day>=1 && day <31){
            if (day<24){
                System.out.println(" burcunuz Terazi ");
            }else System.out.println("burcunuz Akrep");
        }}
        if (mont==11) {
            if (day >= 1 && day < 31) {
                if (day < 23) {
                    System.out.println(" burcunuz Akrep ");
                } else System.out.println("burcunuz Yay");
            }}
            if (mont == 12) {
                if (day >= 1 && day < 31) {
                    if (day < 23) {
                        System.out.println(" burcunuz Yay ");
                    } else System.out.println("burcunuz Oglak");
                }


            }else System.out.println("lütfen gecerli ay ve gün giriniz ...");


        }
}

package Döngüler;

import java.util.Scanner;

public class HarmonikSeri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println(" lütfen bir sayi giriniz...");
        int n=scan.nextInt();
        double tplm=1;
        for (int i=1;i<=n;i++){
            tplm=tplm+(1/i);
            System.out.println(tplm+" ");
        }
        System.out.println(tplm);
    }
}

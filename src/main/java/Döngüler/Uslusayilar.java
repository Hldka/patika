package Döngüler;

import java.util.Scanner;

public class Uslusayilar {
    public static void main(String[] args) {

        int n, k;
        Scanner scan = new Scanner(System.in);
        System.out.println(" bir sayi giriniz");
        n = scan.nextInt();
        System.out.println("Girmek istediginiz üslü sayiyiy yaziniz...");
        k = scan.nextInt();
        int sum = 1;
        for (int i = 1; i <= k; i++) {
            sum = sum * n;
        }
        System.out.println("sonuc : " + sum);

        /*
        Here 
         */



    }

/*
        int n,k ;
        Scanner scan =new Scanner(System.in);
        System.out.println(" bir sayi giriniz");
        n=scan.nextInt();
        System.out.println("Girmek istediginiz üslü sayiyiy yaziniz...");
        k=scan.nextInt();
        int sum=1;
        for (int i=1;i<=k;i++){
            sum=sum*n;
        }
        System.out.println("sonuc : "+sum);

 */


}

package Döngüler;

import java.util.Scanner;

public class faktöryel {
    public static void main(String[] args) {
        //n!=1*2*3*4........n

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz....");
        int n=scan.nextInt();
        int sum=1;
        for (int i = 1; i<=n; i++){
           sum=sum*i;
        }
        System.out.println(n+".fakröryel :"+sum);


    }
}

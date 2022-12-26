package Döngüler;

import java.util.Scanner;

public class hackerranck {
    public static void main(String[] args) {
        int a,b;
        Scanner scan=new Scanner(System.in);
        System.out.println("input a:");
        a= scan.nextInt();
        System.out.println("input b:");
         b=scan.nextInt();
        System.out.println("input n");
        double n= scan.nextDouble();


        for (int i=0;i<n;i++){

            System.out.println(a+(Math.pow(2,i)*b));
           for (int k=0;k<=n;k++){}
        }

    }
}

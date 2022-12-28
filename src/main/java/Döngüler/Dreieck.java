package Döngüler;

import java.util.Scanner;

public class Dreieck {
    /*Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak,
     yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Wie viele stufen wollen Sie");
        int stf=scan.nextInt();
        for (int i=0;i<stf;i++){
            for (int space=1;space<stf;space++){
                System.out.print(" ");
            }  for (int stern=0;stern<(2*i);stern++){
                System.out.print("*");
            }
            System.out.println();}


    }
}

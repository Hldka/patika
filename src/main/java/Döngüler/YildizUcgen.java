package Döngüler;

import java.util.Scanner;

public class YildizUcgen {
    public static void main(String[] args) {
        int row;
        Scanner scan=new Scanner(System.in);
        System.out.printf("bitte schreiben row ...");
        row=scan.nextInt();

        for (int i=1;i<=row;i++){

            for (int k=1;k<=(row-i);k++){
                System.out.print(" ");
            }for (int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }


    }
}

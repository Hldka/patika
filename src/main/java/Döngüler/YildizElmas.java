package Döngüler;

import java.util.Scanner;

public class YildizElmas {
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

        }for (int l=row;l>0;l--){for (int a=1;a<=(row-l);a++){
            System.out.print(" ");
        }for (int b=1;b<=(2*l)-1;b++){
            System.out.print("*");}
            System.out.println();

        }
    }
}

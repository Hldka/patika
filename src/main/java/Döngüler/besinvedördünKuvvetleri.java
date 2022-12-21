package Döngüler;

import java.util.Scanner;

//Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class besinvedördünKuvvetleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz...");
        int say=scan.nextInt();
        for (int i=1;i<=say;i*=5){
            System.out.print("5 ün kuvvetleri :"+ i+" ");
        }
        System.out.println();
        for (int i=1;i<=say;i*=4){
            System.out.print("4 ün kuvvetleri :"+ i+" ");
        }
    }
}

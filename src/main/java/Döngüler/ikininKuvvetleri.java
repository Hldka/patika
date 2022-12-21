package Döngüler;

import java.util.Scanner;
//Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
public class ikininKuvvetleri {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir tane sayi giriniz");
        int n= scan.nextInt();
        for (int i=1;i<=n;i*=2){
            System.out.println(i);

        }
    }
}

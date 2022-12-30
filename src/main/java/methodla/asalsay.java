package methodla;

import java.util.Scanner;

public class asalsay {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi giriniz...");
        int a=scan.nextInt();
        asalSayBul(a);
    }

    private static void asalSayBul(int a) {
        int cout=0;
        for (int i=2;i<a;i++){
            if (a==1){
                System.out.println("asal sayi ");
            }
            else if (a%i==0){
                cout++;
            }
        }if (cout==0){
            System.out.println("asal sayi dir");
        }else System.out.println("asal sayi degildir");
    }
}

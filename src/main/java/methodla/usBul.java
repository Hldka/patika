package methodla;

import java.util.Scanner;

public class usBul {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Taban degerini giriniz");
        int a=scan.nextInt();
        System.out.println("Üs degerini giriniz");
        int b=scan.nextInt();
        ussüBul(a,b);
    }

    private static void ussüBul(int a, int b) {
        int sonc=1;
        for (int i=1;i<=b;i++){
            sonc=sonc*a;

        }
        System.out.println(sonc);
    }
}

import java.util.Scanner;

public class VucütKitleIndeksi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen boyunuzu metre cinsinden giriniz...");
        double boy= scan.nextDouble();
        System.out.println("Lütfen kilonuzu kg olarak giriniz ...");
        double kilo= scan.nextDouble();
        System.out.println("Vücut kitle indeksiniz "+ kilo/(boy*boy));
    }
}

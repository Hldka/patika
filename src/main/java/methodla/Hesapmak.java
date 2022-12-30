package methodla;

import java.util.Scanner;

public class Hesapmak {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int select;

        String menu = "1- Toplama isLemi\n"
                + "2- Cikarma islemi\n"
                + "3- Carpma islemi\n"
                + "'4- Bölme istemi\n"
                + "15- ÜslÜ Sayi Hesaplama \n"
                + "6- Mod Alma\n"
                + "7 - Dikdörtgen Alan ve Cevre Hesabz\n"
                + "O- Cikis Yap";
        System.out.println(menu);
        do {
            System.out.println("  bir islem seciniz : ");
            select=scan.nextInt();
            System.out.println(" islem yapmak istediniz 1. rakam");
            int a=scan.nextInt();
            System.out.println(" islem yapmak istediginiz ikinci rakam");
            int b=scan.nextInt();
            switch (select){
                case 1:toplamayap(a,b);
                break;
                case 2:cikarmaYap(a,b);
                break;
                case 3:carpmaYap(a,b);
                break;
                case 4:bölmeYap(a,b);
                break;
                case 5:üslüsayHesapla(a,b);
                break;
                case 6: modAl(a,b);
                break;
                case 7:dikdörtgenAlanVeCevreHesapla(a,b);
                break;


            }
        }while (select!=0);
        System.out.printf("Görüsmek üzere");

    }

    private static void dikdörtgenAlanVeCevreHesapla(int a, int b) {
        System.out.printf("Dikdörtgenin cevresi : "+(a+b)*2);
        System.out.printf("Dikdörtgenin alani : "+a*b);
    }

    private static void modAl(int a, int b) {
        System.out.printf("anin b'ye göre Mod'u"+a%b);
    }

    private static void üslüsayHesapla(int a, int b) {
        System.out.printf("Üslü sayi hesapla"+Math.pow(a,b));
    }

    private static void carpmaYap(int a, int b) {
        System.out.printf("carpma a*b :  "+(a*b));
    }

    private static void bölmeYap(int a, int b) {
        if (a!=0&& b!=0){
         if (a>b){
            System.out.println(a/b);
        }else System.out.printf("b/a");}else System.out.println(" bu islem yapilamaz");
    }

    private static void cikarmaYap(int a,int b) {
        if (a>b){
            System.out.println(a-b);
        }else
        System.out.println(b-a);    }

    private static void toplamayap(int a, int b) {
        System.out.println(a+b);
    }
}

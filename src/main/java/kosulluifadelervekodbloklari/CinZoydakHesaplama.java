package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class CinZoydakHesaplama {
    /*
Java ile kullanıcıdan doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Dogum Yilinizi Giriniz...");
        int yil=scan.nextInt();
        zoydakCinTakvimiBul(yil);
    }public static void zoydakCinTakvimiBul(int yil){
        int kaln=yil%12;
        switch (kaln){
            case 0:
                System.out.println("Cin Zoydagi Burcunuz : Maymun");
                break;
            case 1:
                System.out.println("Cin Zoydagi Burcunuz : Horoz");
                break;
            case 2:
                System.out.println("Cin Zoydagi Burcunuz : Köpek");
                break;
            case 3:
                System.out.println("Cin Zoydagi Burcunuz : Domuz");
                break;
            case 4:
                System.out.println("Cin Zoydagi Burcunuz : Fare");
                break;
            case 5:
                System.out.println("Cin Zoydagi Burcunuz : Öküz");
                break;
            case 6:
                System.out.println("Cin Zoydagi Burcunuz : Kaplan");
                break;
            case 7:
                System.out.println("Cin Zoydagi Burcunuz : Tavsan");
                break;
            case 8:
                System.out.println("Cin Zoydagi Burcunuz : Ejderha");
                break;
            case 9:
                System.out.println("Cin Zoydagi Burcunuz : Yilan");
                break;
            case 10:
                System.out.println("Cin Zoydagi Burcunuz : At");
                break;
            case 11:
                System.out.println("Cin Zoydagi Burcunuz : Koyun");
                break;
            default:
                System.out.println("tarihi yanlis girdiniz ....");

        }
    }
}

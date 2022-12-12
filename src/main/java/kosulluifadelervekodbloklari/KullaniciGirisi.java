package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String usernama,password;
        Scanner scan=new Scanner(System.in);
        System.out.println("Kullanici adini giriniz...");
        usernama=scan.nextLine();
        System.out.println("sifreniz giriniz...");
        password=scan.nextLine();
        if (usernama.equalsIgnoreCase("patika")&& password.equalsIgnoreCase("java123")){
            System.out.println("giris yaptiniz...");
        }else System.out.println("bilgileriniz yanlis...");

    }
}

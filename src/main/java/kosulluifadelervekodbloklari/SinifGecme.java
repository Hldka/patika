package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        // degiskenleri olustur
        int mat, fizik, kimya, türkce, muzik;
        //scanner sayfasini olustur
        Scanner scan = new Scanner(System.in);
        //Kullanicidan degerleri al
        System.out.println("Lütfen Matematik  notunuzu giriniz : ");
        mat = scan.nextInt();
        if ((mat <= 0) && (mat > 100)) {
            System.out.println("1-100 arasinda bir rakam giriniz");
        }


        System.out.println("Lütfen Fizik notunuzu giriniz : ");
        fizik = scan.nextInt();
        if ((fizik <= 0) && (fizik > 100)) {
            System.out.println("1-100 arasinda bir rakam giriniz");
        }

        System.out.println("Lütfen Kimya notunuzu giriniz : ");
        kimya = scan.nextInt();
        if ((kimya <= 1) && (kimya > 100)) {
            System.out.println("1-100 arasinda bir rakam giriniz");
        }
        System.out.println("Lütfen Türkce notunuzu giriniz : ");
        türkce = scan.nextInt();
        if ((türkce <= 1) && (türkce > 100)) {
            System.out.println("1-100 arasinda bir rakam giriniz");
        }
        System.out.println("Lütfen Muzik notunuzu giriniz : ");
        muzik = scan.nextInt();

        if ((muzik <= 1) && (muzik > 100)) {
            System.out.println("1-100 arasinda bir rakam giriniz");
        }

        double avrg = (mat + muzik + türkce + kimya + fizik) / 5;
        if (avrg >= 55) {
            System.out.println(avrg + "notu ile gectiniz ");
        } else System.out.println(+avrg + "kaldiniz gecme notu 55 ");

    }}


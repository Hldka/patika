import java.util.Scanner;

public class NotOrtlamasiniHesaplayanProgram {
    public static void main(String[] args) {
        // degiskenleri olustur
        int mat,fizik,kimya,türkce,tarih,muzik;
        //scanner sayfasini olustur
        Scanner scan=new Scanner(System.in);
        //Kullanicidan degerleri al
        System.out.println("Lütfen Matematik  notunuzu giriniz : ");
        mat=scan.nextInt();
        System.out.println("Lütfen Fizik notunuzu giriniz : ");
        fizik=scan.nextInt();
        System.out.println("Lütfen Kimya notunuzu giriniz : ");
        kimya=scan.nextInt();
        System.out.println("Lütfen Türkce notunuzu giriniz : ");
        türkce=scan.nextInt();
        System.out.println("Lütfen Tarih notunuzu giriniz : ");
        tarih=scan.nextInt();
        System.out.println("Lütfen Muzik notunuzu giriniz : ");
        muzik=scan.nextInt();
        int tplm=mat+muzik+fizik+kimya+tarih+türkce;
        double ort=tplm/6;
        System.out.println(ort>6?"gecti":"kaldi");
    }
}

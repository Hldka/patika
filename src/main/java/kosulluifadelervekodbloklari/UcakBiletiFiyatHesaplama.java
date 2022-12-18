package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class UcakBiletiFiyatHesaplama {/*
Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın ve
sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır*/

    public static void main(String[] args) {
        double yas,mesafe,ucusTipi;
        Scanner scan=new Scanner(System.in);
        System.out.println("Ucagimiza hosgeldiniz.....");
        System.out.println(" gitmek istediginiz mesafeyi km cinsinden giriniz....");
        mesafe=scan.nextInt();
        System.out.println("lütfen yasinizi giriniz....");
        yas=scan.nextInt();
        System.out.println(" lüften sadece tey yön ise 1 yaziniz, gidis dönus 2 yaziniz...");
        ucusTipi=scan.nextInt();
        double tplmfiyat1=mesafe*0.10;

        System.out.println( "Bilet ücretiniz..." +(tplmfiyat1 + yasIndirim(yas, tplmfiyat1) - ucustipi(ucusTipi, tplmfiyat1))+" Tl");

    } public static int yasIndirim(double yas,double tplmfiyat1 ){
      if (0<yas && yas<12){
         return (int) (0.5*tplmfiyat1);
      }
      else if (yas<24) {
          return (int) (0.1*tplmfiyat1);

      } else if (yas>65) {
          return (int) (0.3*tplmfiyat1);}   return (int) (tplmfiyat1*1);



    }public static double ucustipi(double ucusTipi,double tplmfiyat1){
        if (ucusTipi==1){
           return tplmfiyat1;
        } else if (ucusTipi==2) {return tplmfiyat1*0.2;


        }return tplmfiyat1;
    }
}

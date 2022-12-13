package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class Sicaklik {
    /*Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.*/
    public static void main(String[] args) {
 int hitz;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen sicaklik giriniz....");
        hitz=scan.nextInt();

        if (hitz<=5){
            System.out.println("Empfehlen wir uns .... SKI fahren...");
        } else if (hitz>5 && hitz<=15) {
            System.out.println("Empfehlen wir uns ....KIno zu gehen ");

        } else if (hitz>15 && hitz<=25) {
            System.out.println("empfehlun wir uns ... Picnik zu machen");

        }else System.out.println(" Empfehlen wir uns....Schwimmen zu gehen");


    }
}

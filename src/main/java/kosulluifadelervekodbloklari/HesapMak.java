package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class HesapMak {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner scan=new Scanner(System.in);
        System.out.println("ilk sayiyi giriniz...");
        n1=scan.nextInt();
        System.out.println("ikinci sayiyi giriniz...");
        n2=scan.nextInt();
        System.out.println("1-Toplama \n2-CIkarma\n3-Carpma\n4-Bölme");
        System.out.println("Seciminiz :");
        select=scan.nextInt();
        switch (select){
            case 1:
                System.out.println("n1+n2 = " + n1+n2);
                break;
            case 2:
                System.out.println(n1 > n2 ? "n1-n2" : "(n2-n1)");

                break;
            case 3:
                System.out.println("n1+n2 = " + n1*n2);
                break;

            case 4:
                System.out.println(n1>n2? (n2!=0? n1/n2:"Bir sayi sifir'a bölünmez"):(n1!=0? n2/n1:"Bir sayi sifi'a bölünmez"));;
                break;
            default:
                System.out.println("yanlis secim yaptiniz...");



        }

    }
}

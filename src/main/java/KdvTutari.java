import java.util.Scanner;

public class KdvTutari {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println(" KDV'sini hesaplamak istediginz sayiyi giriniz...");
        int say=scan.nextInt();

        if (1000>say&& say>0) {
            System.out.println("Kdv'li fiyat = "+say * (1.18));
            System.out.println("KDV tutari = "+ 1.8*say);

        } else if (1000>say) {
            System.out.println("Kdv'li fiyat = "+say * (1.08));
            System.out.println("KDV tutari = "+ 0.8*say);
        }else System.out.println("lütfen gecerli bir rakam giriniz...");
    }
}

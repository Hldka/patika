import java.util.Scanner;

public class DaireninAlaniveCevresi {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen dairenin yaricapini giriniz...");
        int r= scan.nextInt();
        System.out.println("alan formülü "+ 3.14*r*r);
        System.out.println(" cevre formülü"+ 2*(3.14)*r);
        System.out.println("merkez acisi ölcüsü giriniz");
        int aci= scan.nextInt();
        System.out.println("Yaricapi :"+r+"merkez acisi ø: "+aci+" daire diliminin alani : "+(3.14*r*r*aci)/360);
    }
}

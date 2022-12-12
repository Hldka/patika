import java.util.Scanner;

public class TaksimetreHesapla {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen gittiginiz km sayiyini giriniz");
        int km=scan.nextInt();
        double yl=10+(1.20*km);
        if (yl<20){
            System.out.println(" taksimetre ücreti : "+20+"tl");
        }else System.out.println("taksimeter ucreti :"+10+(1.20*km));

    }
}

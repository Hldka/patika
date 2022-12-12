import java.util.Scanner;

public class DikUcgenHesapla {
    public static void main(String[] args) {
        int a,b;
        double c;
        // kullanicidan verilerimizi alalim
        Scanner scan=new Scanner(System.in);
        System.out.println("1.Kenari Giriniz...");
        a=scan.nextInt();
        System.out.println("2.Kenari Giriniz...");
        b=scan.nextInt();
        c=Math.sqrt((a*a)+(b*b));
        double u=(a+b+c)/2;
        System.out.println("Hipotenüs : "+ c);
        System.out.println("ücgenin cevresi "+(a+b+c));
        double alan=u*(u-a)*(u-b)*(u-c);

        double alan2=Math.sqrt(alan);
        System.out.println("ücgenin alani = "+alan2);

    }
}

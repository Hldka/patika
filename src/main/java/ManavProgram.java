import java.util.Scanner;

public class ManavProgram {
    public static void main(String[] args) {
double armut =2.14;
double elma=3.67;
double domates =1.11;
double muz=0.95;
double patlican =5.00;
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen istediginiz ürünü " +
                "\n Armut :1\n Elma :2\n Domates :3\n Muz :4\n Patlican : 5");
        int secim=scan.nextInt();
        System.out.println("kac kilo oldugunu giriniz");
        int kilo= scan.nextInt();


        switch (secim){
            case 1:
                System.out.println("Armut = " + armut*kilo+"Tl");
                break;
            case 2:
                System.out.println("Elma = " + elma*kilo+"Tl");
                break;
            case  3:
                System.out.println("Domates = " + domates*kilo+"Tl");
                break;
            case 4:
                System.out.println("Muz = " + muz*kilo+"Tl");
                break;
            case  5:
                System.out.println("Patlican = " + patlican*kilo+"Tl");
                break;
        }

    }
}

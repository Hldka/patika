package kosulluifadelervekodbloklari;

import java.util.Scanner;

public class saySiralama {
    public static void main(String[] args) {
int say1,say2,say3;
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 3 sayi giriniz...");
        System.out.println("birinci sayi ");
        say1=scan.nextInt();
        System.out.println("ikinci sayi ");
        say2=scan.nextInt();
        System.out.println("ücüncü sayi ");
        say3=scan.nextInt();
        if (say1>say2&& say1>say3){
            if (say2>say3){

                System.out.println(say1+" > "+say2+" > "+say3);
            }else System.out.println(say1+" > "+say3+" > "+say2);
        } else if (say2>say1 && say2>say3) {if (say1>say3){
            System.out.println(say2+" > "+say1+" > "+say3);
        }else System.out.println(say2+" > "+say3+" > "+say1);

        } else if (say3>say1&& say3>say2) {if (say2>say1 ){
            System.out.println(say3+" > "+say2+" > "+say1);
        }else System.out.println(say3+" > "+say1+" > "+say2);

        }else System.out.println("lütfen gecerli sayi giriniz...");


    }
}

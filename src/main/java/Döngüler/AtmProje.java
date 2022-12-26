package Döngüler;

import java.util.Scanner;

public class AtmProje {
    public static void main(String[] args) {
        String username,password;
        Scanner scan=new Scanner(System.in);
        int rigt=3;
        int balance=2000;
        int select;
while (rigt>0){
        System.out.println(" Bitte schreiben username :");
        username=scan.nextLine().toLowerCase();
        System.out.println("Bitte schreiben password");
        password=scan.nextLine().toLowerCase();
        if (username.equals("neuname")&&password.equals("dev321")){
            System.out.println(" Willkommen Glückbank... ");
            do {
                System.out.println("was wollen sie wahlen...");
                System.out.println(" 1- Geld eingeben\n"+"2. Geld ausgeben\n"+"3-Wieviel Geldd haben sie\n"+"Ausgang");
                select =scan.nextInt();
                switch (select){
                    case 1:
                        System.out.println(" Geld");
                        int price=scan.nextInt();
                        balance+=price;

                    case 2:
                        System.out.println(" geld ");
                        price=scan.nextInt();
                        if (price>balance){
                            System.out.println("leider keine genug geld");
                        }else {balance=balance-price;}
                    case 3:
                        System.out.println(" Ihre geld: "+balance);
                    default:
                        System.out.println("falshe wahlen.... bitte achten sie...");
                }
            }while (select!=4);
            System.out.println(" Tschüsss bis Nächtessmmal....");break;

        }else {rigt--;
            System.out.println("username ode password ist false... bitte versuchen weiter");
        if (rigt==0){
            System.out.println(" Ihre konto ist gespert.....");
        }else {
            System.out.println(" Sie können versuchen : "+rigt+" mal");
        }}
}

    }
}

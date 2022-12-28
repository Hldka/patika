package Döngüler;

import java.util.Scanner;

public class perfecteZahl {
    /*perfectzahl: Die Summe der positiven ganzzahligen Multiplikatoren
    (die Zahl, die ohne den Rest teilt), außer der Zahl selbst.*/
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bitte geben Sie einen Zahl ein");
        int zif=scan.nextInt();
        int count=0;
        for (int i=1;i<zif;i++){
            if (zif%i==0){count=i+count;}
        }if (count==zif){
            System.out.println("Perfect zahl");
        }else System.out.println(zif+" ist nicht PerfectZahl ");

    }
}

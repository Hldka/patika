package Döngüler;

import java.util.Scanner;

public class enbüyükveenkücüksayi {
    public static void main(String[] args) {
        int min=0,max=0,i=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Wieviel zahlen wollen Sie eingeben...");
        int n= scan.nextInt();
        while (n > 0){
            System.out.print(i + ". te zahlen geben Sie ein  :"); int zif = scan.nextInt();
            if(i == 1){
                min = zif;
                max = zif;
            }else {
                if (min > zif) min = zif;
                if (max < zif) max = zif;
            }
            n --;
            i ++;
        }
        System.out.println("Max :" + max + " Min :" + min);
    }
}

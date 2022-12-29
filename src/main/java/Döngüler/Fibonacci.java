package Döngüler;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("wieviel fibonaccizahl wollen Sie schauen? ");
        int say=scan.nextInt();
        if(say==1){
            System.out.println(1);
        } else if (say==2) {
            System.out.println(1+" "+1);

        } else if (say<=0) {
            System.out.println(" es gibt keine zahl--");

        }else {int a = 1;
            int b = 1;
            int count = 0;
            System.out.print(1+" "+1+" ");
            for (int i = 1; i <= say-2; i++) {

                count = a + b;
                System.out.print(count + " ");
                a = b;
                b = count;}

    }

    }


}

package Döngüler;

import java.util.Scanner;

public class EbobOkek {
    public static void main(String[] args) {
        int n,m;
        Scanner scan=new Scanner(System.in);
        System.out.println(" bitte geben ein Zahl ein...");
        n=scan.nextInt();
        System.out.println(" bitte geben zweite Zahl ein....");
        m=scan.nextInt();
        int x;
        int ebob=0;
        if (m>n){x=m;}else {x=n;}
int i=1;
while (i<=x){

            if (n%i==0&&m%i==0){
                System.out.print(i+" ");
                ebob =i;
            }i++;
        }
        System.out.println("ebob = " + ebob);

        int ekok=(m*n)/ebob;
        System.out.println("ekok = " + ekok);

    }
}

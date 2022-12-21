package Döngüler;

import java.util.Scanner;

public class föktröryelödev {
    public static void main(String[] args) {
        int n,r;
        int sum=1;
        int total=1;
        int tsum=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen n sayiyini giriniz...");
        n= scan.nextInt();
        System.out.println("lütfen r sayiyini giriniz...");
        r=scan.nextInt();
        for (int i=1;i<=n;i++){
            sum=sum*i;

        }

        for (int j=1;j<=r;j++){total=total*j;}

        for (int k=1;k<=(n-r);k++){
            tsum=tsum*k;

        }

        System.out.println("C("+n+","+r+")   =    "+n+"!"+"/ ("+r+"!*("+n+"-"+r+")!)  :  "+ sum/(total*tsum));

    }
}

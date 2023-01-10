package ArraySinifi;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class elemansiralama {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Bitte schreiben wie viel  elemente arrays");
        int index=0;
        int zif=scan.nextInt();
        int [] arr=new int[zif];
        int[] yarr=new int[zif];
        System.out.println("Bitte schreiben elemente ");

       for (int i=0;i<zif;i++){
           System.out.println((i+1)+".  te element :");
           arr[i]=scan.nextInt();
       }for (int j=0;j<zif;j++){
           yarr[index++]=arr[j];
        }
        System.out.println("Ordner :"+Arrays.toString(yarr));

    }
}

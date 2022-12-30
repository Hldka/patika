package methodla;

import java.util.Scanner;

public class Fibonnacci {
    static int fib(int n){
        if (n == 1|| n == 2){return 1;}else
        {return fib(n-1)+fib(n-2);}
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("kac tane fibonacci sayiysi görmek istersiniz...");
        int n=scan.nextInt();
       fib(n);
        System.out.println(fib(n));
    }
}

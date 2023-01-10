package ArraySinifi;

import java.util.Scanner;

public class DizidekiElemanfrekansi {

    public static void main(String[] args) {
        freqArr(receiveArr());

        }
    static int[] receiveArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");

        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + (i + 1) + ". element of the array: ");
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    static boolean isInclude(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    static void freqArr(int[] arr) {
        int[] storage = new int[arr.length];
        int counter;
        for (int i = 0; i < arr.length; i++) {
            counter = 1;
            if (!(isInclude(storage, arr[i]))) {
                storage[i] = arr[i];
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        counter++;
                    }
                }
                System.out.println("The number " + arr[i] + " is repeated " + counter + " times.");
            }
        }
    }





    }


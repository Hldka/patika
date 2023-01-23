package ArraySinifi;

import java.sql.Array;
import java.util.Arrays;

public class MatrisTranspozunubulma {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 7, 3},
                {2, 5, 4},
                {10, 8, 9},
        };

        int[][] transpose = new int[matrix[0].length][matrix.length];

        System.out.println("Matris: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transpose: ");

        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[i].length; j++) {
                transpose[i][j] = matrix[j][i];
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

    }
}

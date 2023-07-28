package Infosys;

import java.util.*;

public class Transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                original[i][j] = sc.nextInt();
            }

        }
        int transpose[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transpose[i][j] = original[j][i];
            }
        }
        System.out.println("Printing Matrix without transpose:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Printing Matrix After Transpose:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(transpose[i][j] + " ");

            }
            System.out.println();

        }
    }
}
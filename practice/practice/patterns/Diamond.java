package patterns;

import java.util.*;

public class Diamond {
    void fuction(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            // System.out.println();
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.println("");
            }
            // System.out.println();

            for (int j = 0; j < n - i + 1; j++) {
                System.out.print("*");
            }
            // System.out.println();
        }
        System.out.println();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Diamond pattern = new Diamond();
        pattern.fuction(n);
    }
}

package Mindtree;

import java.util.*;

public class NotAFib {
    static boolean fib(int n) {
        return perfect(5 * n * n + 4) || perfect(5 * n * n - 4);
    }

    private static boolean perfect(int x) {
        int s = (int) Math.sqrt(x);
        return (s * s == x);

    }

    private static int fun(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (fib(arr[i])) {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(fun(arr, n));
    }

}

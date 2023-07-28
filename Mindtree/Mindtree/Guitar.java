package Mindtree;

import java.util.*;
import java.util.Arrays;

public class Guitar {
    static int fun(int arr[], int n) {
        int sum = 0;
        Arrays.sort(arr);
        for (int i = n - 1; i >= 0; i++) {
            sum += (arr[i] * (i + 1));
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            System.out.println(fun(arr, n));
        }
    }
}

package Linearsearch;

import java.util.*;

public class LinearSearch {
    // Search in the array:return the index if the item found
    // Otherwise if the item not found return -1;
    static int linearSearch(int arr[], int target) {
        if (arr.length == 0)
            return -1;

        // Run a for loop
        for (int i = 0; i <= arr.length; i++) {
            int element = arr[i];
            if (element == target) {
                return i;
            }
        }
        // if nothing found return -1;
        return -1;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int target = sc.nextInt();
        int result = linearSearch(arr, n);
        System.out.println(result);

    }

}

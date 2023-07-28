import java.util.Scanner;

class Solution {
    public static int[] subarraySum(int[] arr, int n, int sum) {
        int left = 0;
        int right = 0;
        int currSum = 0;
        int[] result = new int[n];
        if (sum == 0) {
            result[0] = -1;
            return result;
        }
        while (right <= n) {
            if (currSum == sum) {
                result[0] = left + 1;
                result[1] = right;
                return result;
            }
            if (currSum > sum) {
                currSum -= arr[left];
                left++;
            } else {
                if (right < n)
                    currSum += arr[right];
                right++;
            }
        }
        result[0] = -1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = sc.nextInt();
        int[] result = subarraySum(arr, n, sum);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }
}
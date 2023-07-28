public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
        long[] arr = new long[n + 1];

        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            arr[a] += k;
            if (b + 1 <= n) {
                arr[b + 1] -= k;
            }
        }

        long maxVal = 0;
        long prefixSum = 0;
        for (int i = 1; i <= n; i++) {
            prefixSum += arr[i];
            maxVal = Math.max(maxVal, prefixSum);
        }

        return maxVal;
    }

    public static void main(String[] args) {
        int n = 5;
        int[][] queries = {
                { 1, 2, 100 },
                { 2, 5, 100 },
                { 3, 4, 100 }
        };

        long result = arrayManipulation(n, queries);
        System.out.println("Maximum value after array manipulation: " + result);
    }

}

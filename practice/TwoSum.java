import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[0];
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        Solution sol = new Solution();
        int[] indices = sol.twoSum(nums, target, n);
        for (int index : indices) {
            System.out.print(index + " ");
        }
    }
}

import java.util.*;

class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        int back = -1;
        int front = -1;
        int sum = 0;
        boolean check = false;
        while (front < arr.length) {
            if (sum > s) {

                sum -= arr[back];
                back = back + 1;
            }
            if (sum < s) {
                if (front == -1) {
                    front = front + 1;
                    back = back + 1;
                    sum += arr[front];
                } else {
                    front = front + 1;
                    sum += arr[front];

                }
            }
            if (sum == s) {
                check = true;
                break;
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();

        if (check == true) {
            ans.add(back + 1);
            ans.add(front + 1);

            return ans;
        } else {
            ans.add(-1);
            return ans;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] result = subarraySum(arr, n, sum);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }

}
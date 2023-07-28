import java.util.Scanner;

public class Conversion {
    static int func(int n) {
        int arr[] = new int[32];
        int temp[] = new int[32];
        int t = 0, base = 1, index = 0;
        while (n != 0) {
            arr[index++] = n % 2;
            n /= 2;
        }
        temp[0] = arr[0] ^ 1;
        for (int i = 1; i < index; i++) {
            base *= 2;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(func(n));
    }
}
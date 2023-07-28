package Mindtree;

import java.util.*;

public class Salsa {
    static int fun(String x, String y) {
        int result;
        int count = 0;
        float temp;
        char a[] = x.toCharArray();
        char b[] = y.toCharArray();
        for (int i = 0; i < 8; i++) {
            result = (a[i] - 48) ^ (b[i] - 48);
            if (result == 1) {
                count++;
            }

        }
        temp = (float) (count / 8.0) * 100;
        result = (int) (Math.floor(temp));
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String y = sc.nextLine();
        System.out.println(fun(x, y) + "%");
    }
}

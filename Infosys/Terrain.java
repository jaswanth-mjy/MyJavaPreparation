package Infosys;

import java.util.*;
import java.lang.Math;

public class Terrain {
    private static double dig;

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = sc.nextInt();

            int dig = 0;
            if (l[i] <= l[i + 1]) {
                dig = Math.max(dig, (l[i + 1] - l[i] + 1));
                l[i + 1] = l[i] - 1;
            }
        }
        int ans = (int) Math.sqrt(dig);
        System.out.println(ans);

    }

}

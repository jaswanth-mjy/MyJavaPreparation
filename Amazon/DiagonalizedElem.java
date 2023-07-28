package Amazon;

/*
 Question
input:
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
output:
1
5 2
9 6 3
13 10 7 4
17 14 11 8
18 15 12
19 16
20

*/
import java.util.*;

public class DiagonalizedElem {
    public static int R, C;

    public static void diagonal(int[][] arr) {
        for (int i = 0; i < R; i++) {
            System.out.println(arr[i][0] + " ");
            int j = i - 1;
            while (isValid(i, j)) {
                System.out.println(arr[i][j] + " ");
                i--;
                j++;

            }
            System.out.println(" ");

        }

    }

    private static boolean isValid(int i, int j) {
        return false;
    }
}
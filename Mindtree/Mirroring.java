package Mindtree;

import java.util.*;

public class Mirroring {
    private static final String Str = null;

    public static void reverse(char str[], int start, int end) {
        char temp;
        while (start <= end) {
            temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
    }

    static char[] reverseWords(char[] S) {
        int start = 0;
        for (int end = 0; end < S.length; end++) {
            if (S[end] == " ") {
                reverse(S, start, S.length - 1);
                reverse(S, 0, S.length - 1);
                return S;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] p = reverseWords(Str.toCharArray());
        System.out.println(p);
    }
}

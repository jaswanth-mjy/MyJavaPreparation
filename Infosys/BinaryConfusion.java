package Infosys;

import java.util.*;

class BinaryConfusion {
    static String binary(int n) {
        StringBuilder binary = new StringBuilder();
        while (n > 0) {
            if (n % 2 == 0) {
                binary.append('0');
            } else {
                binary.append('1');
            }
            n = n / 2;

        }
        StringBuilder finalAnswer = binary.reverse();
        return finalAnswer.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = BinaryConfusion.binary(n);
    }
}
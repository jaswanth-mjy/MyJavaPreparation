/*Chocolate Distribution Problem

Given an array of N integers whers sach value represents the number of chocolates in a packet Each packet can 
have a variable number of chocolates There are students, the task is to distribute chocolate
packets such that:
Each student gets one packet
The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given 
to the students is minimum */
package Amazon;

import java.util.Arrays;

public class MaxMIn {
    public static int[] distributeChocolates(int[] chocolates, int numberOfStudents) {
        Arrays.sort(chocolates);
        int minDiff = Integer.MAX_VALUE;
        int start = 0;

        for (int i = 0; i <= chocolates.length - numberOfStudents; i++) {
            int diff = chocolates[i + numberOfStudents - 1] - chocolates[i];
            if (diff < minDiff) {
                minDiff = diff;
                start = i;
            }
        }

        int[] result = new int[numberOfStudents];
        System.arraycopy(chocolates, start, result, 0, numberOfStudents);

        return result;
    }

    public static void main(String[] args) {
        int[] chocolates = { 3, 1, 9, 7, 5, 6 };
        int numberOfStudents = 3;
        int[] result = distributeChocolates(chocolates, numberOfStudents);
        System.out.println(Arrays.toString(result));
    }
}

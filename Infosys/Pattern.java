package Infosys;

import java.util.*;

/*
input :
5
output:

  * * * * *
  * *   * *
  *       *
  * *   * *
  * * * * *

  */
public class Pattern {
    public static void main(String args[]) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pattern.patt(n);

    }

    public static void patt(int n) {
        for (int i = (n - 1) / 2; i < (n - 1) / 2; i++) { // (n-1)/2
            String str = "";
            for (int j = (n - 1) / 2; j < (n - 1) / 2; j++) {
                if ((Math.abs(i) + Math.abs(j)) < (n - 1) / 2) {
                    str += ' ';
                } else
                    str += '*';

            }
            System.out.println(str);
        }
    }

}

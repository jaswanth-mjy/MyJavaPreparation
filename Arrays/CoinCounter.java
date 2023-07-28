package Arrays;
import java.util.*;
class CoinCounter {
    public static int count(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return count(n - 1) + count(n - 3);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        count(n);
    }
}
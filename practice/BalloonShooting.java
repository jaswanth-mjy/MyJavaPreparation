import java.util.*;

public class BalloonShooting {
    public static int calculateBalloonsShot(int n) {
        int tBS = 0;
        while (n > 0) {

            tBS += n;
            n /= 2;

        }

        tBS += 1;
        return tBS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int totalBalloonsShot = calculateBalloonsShot(n);
        System.out.println(totalBalloonsShot);
    }
}
/*
 * import java.util.*;
 * 
 * public class BalloonShooting {
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int n = 5;
 * int vnt = 0;
 * for(int i=0;i<n;i++){
 * vnt=vnt+n;
 * if(n%2==0)
 * n=n/2;
 * else
 * }
 * System.out.println(vnt);
 * }
 * }
 */

/*
 * import java.util.Scanner;
 * 
 * public class BalloonShooting {
 * public static void main(String[] args) {
 * Scanner scanner = new Scanner(System.in);
 * 
 * System.out.print("Enter the initial number of balloons: ");
 * int n = scanner.nextInt(); // Initial number of balloons
 * 
 * int balloonsShot = 0; // Counter for the number of balloons shot
 * 
 * while (n > 0) {
 * balloonsShot += n;
 * n = n - 2;
 * }
 * 
 * balloonsShot += 1; // Add one extra shot for the new balloon inserted after
 * shooting
 * 
 * System.out.println("Balloons shot before emptying: " + balloonsShot);
 * 
 * scanner.close();
 * }
 * }
 */

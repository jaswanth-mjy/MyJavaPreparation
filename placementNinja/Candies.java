/*TCS Coding Question
There is a JAR full of candies for sale at a mall counter. JAR has the capacity N, that is JAR can contain maximum N candies when JAR is full. At any point of time. JAR can have M number of Candies where M<=N. Candies are served to the customers. JAR is never remain empty as when last k candies are left. JAR if refilled with new candies in such a way that JAR get full.
Write a code to implement above scenario. Display JAR at counter with available number of candies. Input should be the number of candies one customer can order at point of time. Update the JAR after each purchase and display JAR at Counter.

Output should give number of Candies sold and updated number of Candies in JAR.

If Input is more than candies in JAR, return: “INVALID INPUT”

TestCases
Example-1: N=10,K=<5
Input value =3
Output Value 
Number of candies sold =3
Number of candies available is 7
Example-2: N=10,K<=5
Input value =0
Output Value 
Number of candies left is 10
*/

package placementNinja;
import java.util.Scanner;
class Candies{
    public static void main(String[] args) {
   	 int n = 10, k = 5;
   	 int num;
   	 Scanner sc = new Scanner(System.in);
   	 num = sc.nextInt();
   	 if(num >= 1 && num <= 5) {
   		 System.out.println("NUMBER OF CANDIES SOLD : " + num);
   		 System.out.print("NUMBER OF CANDIES LEFT : " + (n - num));
   	 } else {
   		 System.out.println("INVALID INPUT");
   		 System.out.print("NUMBER OF CANDIES LEFT : " + n);
   	 }
    }
}
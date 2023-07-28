package Arrays;
import java.util.Scanner;

public class SmalLarg {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int largestDigit = 0;
        int smallestDigit = 9;
        
        while (number != 0) {
            int digit = number % 10;
            largestDigit = Math.max(largestDigit, digit);
            smallestDigit = Math.min(smallestDigit, digit);
            number /= 10;
        }
        
        System.out.println("Largest digit: " + largestDigit);
        System.out.println("Smallest digit: " + smallestDigit);
    }
}
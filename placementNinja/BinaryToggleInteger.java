/*
 Convert the integer into binary value and toggle it and then convert it into integer
 */
package placementNinja;
import java.util.Scanner;

public class BinaryToggleInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryString);
        
        StringBuilder toggledBinary = new StringBuilder();
        for (char digit : binaryString.toCharArray()) {
            if (digit == '0') {
                toggledBinary.append('1');
            } else {
                toggledBinary.append('0');
            }
        }
        String toggledBinaryString = toggledBinary.toString();
        System.out.println("Toggled binary: " + toggledBinaryString);
        
        // Convert the toggled binary back to integer
        int toggledNumber = Integer.parseInt(toggledBinaryString, 2);
        System.out.println("Toggled number: " + toggledNumber);
    }
}
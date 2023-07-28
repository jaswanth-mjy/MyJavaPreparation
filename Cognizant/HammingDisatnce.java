/*
 Convert the integer into binary value and toggle it and then convert it into integer
 */
package Cognizant;
import java.util.Scanner;

public class HammingDisatnce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer1: ");
        int number1 = scanner.nextInt();
        String binaryString1 = Integer.toBinaryString(number1);
        System.out.println("Binary representation: " + binaryString1);
        System.out.print("Enter an integer2: ");
        int number2 = scanner.nextInt();
        String binaryString2 = Integer.toBinaryString(number2);
        System.out.println("Binary representation: " + binaryString2);
        
    }

    public static void Hamming(String binaryString1,String binaryString2){
        if(binaryString1.length() !=binaryString2.length()){
            System.out.println("Binary Strings with same length will be evaluated");

        }
        int distance=0;
        for()
    }
    
}
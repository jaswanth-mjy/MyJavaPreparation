package placementNinja;

import java.util.HashMap;
import java.util.*;

public class ConversioninBase17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the String you want to convert: ");
        String hexadecimal = sc.nextLine();

        int decimal = hexToDecimal(hexadecimal);
        System.out.println(decimal);
    }
    
    public static int hexToDecimal(String hex) {
        HashMap<Character, Integer> hexValues = new HashMap<>();
        hexValues.put('0', 0);
        hexValues.put('1', 1);
        hexValues.put('2', 2);
        hexValues.put('3', 3);
        hexValues.put('4', 4);
        hexValues.put('5', 5);
        hexValues.put('6', 6);
        hexValues.put('7', 7);
        hexValues.put('8', 8);
        hexValues.put('9', 9);
        hexValues.put('A', 10);
        hexValues.put('B', 11);
        hexValues.put('C', 12);
        hexValues.put('D', 13);
        hexValues.put('E', 14);
        hexValues.put('F', 15);
        hexValues.put('G', 16);
        hexValues.put('H', 17);
        hexValues.put('J', 18);
        hexValues.put('K', 19);
        hexValues.put('L', 20);
        hexValues.put('M', 21);
        hexValues.put('N', 22);
        hexValues.put('O', 23);
        hexValues.put('P', 24);
        hexValues.put('Q', 25);
        hexValues.put('R', 26);
        hexValues.put('S', 27);
        hexValues.put('T', 28);
        hexValues.put('U', 29);
        hexValues.put('V', 30);
        hexValues.put('W', 31);
        hexValues.put('X', 32);
        hexValues.put('Y', 33);
        hexValues.put('Z', 34);

        hex = hex.toUpperCase();
        int decimal = 0;
        
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            int digit = hexValues.get(c);
            decimal = 17 * decimal + digit;
        }
        
        return decimal;
    }
}
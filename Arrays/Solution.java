import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String key = scanner.next();
        String output = sortStringWithCustomKey(input, key);
        System.out.println(output);
    }

    private static String sortStringWithCustomKey(String input, String key) {
        char[] sortedChars = new char[input.length()];
        char[] inputChars = input.toCharArray();

        // Create a map to store the index of each character in the key
        Map<Character, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            indexMap.put(key.charAt(i), i);
        }

        // Custom comparator to sort characters based on the key index
        Comparator<Character> customComparator = (c1, c2) -> indexMap.get(c1) - indexMap.get(c2);

        // Sort the characters of the input string based on the custom comparator
        List<Character> charList = new ArrayList<>();
        for (char c : inputChars) {
            charList.add(c);
        }
        Collections.sort(charList, customComparator);

        // Convert the sorted list of characters back to a string
        for (int i = 0; i < sortedChars.length; i++) {
            sortedChars[i] = charList.get(i);
        }
        return new String(sortedChars);
    }
}
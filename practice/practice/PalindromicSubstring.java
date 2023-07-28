import java.util.*;

public class PalindromicSubstring {
    public List<List<String>> palindrome(String s) {
        List<List<String>> result = new ArrayList<>();
        List<String> path = new ArrayList<>();
        func(0, s, path, result);
        return result;
    }

    public void func(int index, String s, List<String> path, List<List<String>> result) {
        if (index == s.length()) {
            result.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < s.length(); ++i) {
            if (isPalindrome(s, index, i)) {
                path.add(s.substring(index, i + 1));
                func(i + 1, s, path, result);
                path.remove(path.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start < end) { // Fixed the loop condition here
            if (s.charAt(start++) != s.charAt(end--)) { // Fixed the comparison here
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        PalindromicSubstring palindromicSubstring = new PalindromicSubstring();
        List<List<String>> result = palindromicSubstring.palindrome(input);
        System.out.println(result);
    }
}

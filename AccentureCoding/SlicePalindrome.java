package AccentureCoding;

public class SlicePalindrome {
    public static void main(String[] args) {
        String str = "yjthdhjghjgjhghjhhjghghgjg";
        String palindrome = extractMiddlePalindrome(str);
        System.out.println("Middle palindrome: " + palindrome);
    }

    public static String extractMiddlePalindrome(String str) {
        int len = str.length();
        int start = 0, end = 0;

        for (int i = 0; i < len; i++) {
            int len1 = expandAroundCenter(str, i, i);      // Odd length palindrome
            int len2 = expandAroundCenter(str, i, i + 1);  // Even length palindrome
            int maxLength = Math.max(len1, len2);

            if (maxLength > end - start) {
                start = i - (maxLength - 1) / 2;
                end = i + maxLength / 2;
            }
        }

        return str.substring(start, end + 1);
    }

    private static int expandAroundCenter(String str, int left, int right) {
        int len = str.length();

        while (left >= 0 && right < len && str.charAt(left) == str.charAt(right)) {
            left--;
            right++;
        }

        return right - left - 1;
    }
}

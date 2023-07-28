/*public class StringXor {
    public static int performBitwiseOperations(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();

        for (char c : charArray) {
            if (c == 'A') {
                result &= 1;
            } else if (c == 'B') {
                result |= 1;
            } else if (c == 'C') {
                result ^= 1;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String s = "1C0C1C1A0B1";
        int output = performBitwiseOperations(s);
        System.out.println(output);
    }
}
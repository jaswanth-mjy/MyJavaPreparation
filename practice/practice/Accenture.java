import java.util.*;

/*
 * public class Accenture {
 * public static int performBitwise(String s) {
 * int result = 0;
 * char[] charArray = s.toCharArray();
 * for (char c : charArray) {
 * if (c == 'A') {
 * result &= 1;
 * } else if (c == 'B') {
 * result |= 1;
 * } else if (c == 'C') {
 * result ^= 1;
 * }
 * }
 * return result;
 * }
 * public static void main(String[] args) {
 * String s = "1C0C1C1A0B1";
 * int output = performBitwise(s);
 * System.out.println(output);
 * }
 * }
 */
/*
 * public class Accenture {
 * public static void main(String[] args) {
 * int[] numbers = { 1, 9, 35 };
 * int count = countGoodNumbers(numbers);
 * System.out.println(count);
 * }
 * public static boolean sumOfCubes(int arr[], int n) {
 * int low = 1;
 * int high = (int) Math.cbrt(n);
 * while (low < high) {
 * int res = (low * low * low + high * high * high);
 * if (res == n) {
 * return true;
 * }
 * if (res < n) {
 * low++;
 * }
 * if (res > n) {
 * high--;
 * }
 * }
 * return false;
 * }
 * public static int countGoodNumbers(int[] arr) {
 * int count = 0;
 * for (int num : arr) {
 * if (sumOfCubes(arr, num)) {
 * count++;
 * }
 * }
 * return count;
 * }
 * }
 */
/*
 Question new 
 S1= MAP
 S2 = PAM
 CHECK ANAGRAM
 */
/*
public class Accenture {
    public static boolean areAnagrams(String str1, String str2) {
        // str1 = str1.replaceAll("\\s", "").toLowerCase();
        // str2 = str2.replaceAll("\\s", "").toLowerCase();
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String args[]) {
        String str1 = "MAP";
        String str2 = "PA";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + "&" + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + "&" + str2 + "not anagrams ");
        }

    }
}*/
/*
public class Accenture {
    public static int largeSmallsum(int[] arr, int n) {

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);

        return even.get(even.size() - 2) + odd.get(odd.size() - 2);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = largeSmallsum(arr, n);
        System.out.println(x);
    }
}*/
/*
import java.util.Scanner;

public class Accenture {

    public static boolean validatePassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        boolean hasUpperCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpperCase = true;
                break;
            }
        }
        if (!hasUpperCase) {
            return false;
        }

        boolean hasLowerCase = false;
        for (char ch : password.toCharArray()) {
            if (Character.isLowerCase(ch)) {
                hasLowerCase = true;
                break;
            }
        }
        if (!hasLowerCase) {
            return false;
        }

        boolean hasDigit = false;
        for (char ch : password.toCharArray()) {
            if (Character.isDigit(ch)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (validatePassword(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is invalid.");
        }

        scanner.close();
    }

}
*/
/*
public class SpiralPatternPrinter {

    // Method to print a spiral pattern
    static void printSpiralPattern(int size) {
        int row = 0, col = 0;
        int boundary = size - 1;
        int sizeLeft = size - 1;
        int rotationCount = 1;
        char move = 'r';
        int[][] matrix = new int[size][size];

        for (int i = 1; i <= size * size; i++) {
            matrix[row][col] = i;

            switch (move) {
                case 'r':
                    col += 1;
                    break;
                case 'l':
                    col -= 1;
                    break;
                case 'u':
                    row -= 1;
                    break;
                case 'd':
                    row += 1;
                    break;
            }

            if (i == boundary) {
                boundary += sizeLeft;
                if (rotationCount != 2) {
                    rotationCount = 2;
                } else {
                    rotationCount = 1;
                    sizeLeft -= 1;
                }

                switch (move) {
                    case 'r':
                        move = 'd';
                        break;
                    case 'd':
                        move = 'l';
                        break;
                    case 'l':
                        move = 'u';
                        break;
                    case 'u':
                        move = 'r';
                        break;
                }
            }
        }

        // Printing the spiral matrix or pattern
        for (row = 0; row < size; row++) {
            for (col = 0; col < size; col++) {
                int n = matrix[row][col];
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        int size = 5; // Size of the matrix (5x5)
        System.out.println("Spiral Matrix or Pattern is:\n");
        printSpiralPattern(size);
    }
} */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
}

class BankingApplication {
    private static Map<String, BankAccount> accounts = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createAccount(scanner);
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    checkBalance(scanner);
                    break;
                case 5:
                    System.out.println("Exiting the application.");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("===== Banking Application =====");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Check Balance");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    private static void createAccount(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        System.out.print("Enter account holder name: ");
        String accountHolderName = scanner.next();
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, initialBalance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully.");
    }

    private static void deposit(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter the deposit amount: ");
            double amount = scanner.nextDouble();
            BankAccount account = accounts.get(accountNumber);
            account.deposit(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void withdraw(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            System.out.print("Enter the withdrawal amount: ");
            double amount = scanner.nextDouble();
            BankAccount account = accounts.get(accountNumber);
            account.withdraw(amount);
        } else {
            System.out.println("Account not found.");
        }
    }

    private static void checkBalance(Scanner scanner) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.next();
        if (accounts.containsKey(accountNumber)) {
            BankAccount account = accounts.get(accountNumber);
            System.out.println("Account Holder Name: " + account.getAccountHolderName());
            System.out.println("Account Balance: " + account.getBalance());
        } else {
            System.out.println("Account not found.");
        }
    }
}

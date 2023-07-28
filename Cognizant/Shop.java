package Cognizant;
import java.util.Scanner;


public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numProducts = scanner.nextInt();
        scanner.nextLine();

        String lowestValueProduct = "";
        long lowestValue = Long.MAX_VALUE;

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter product details (name, price, quantity) separated by commas:");
            String[] productDetails = scanner.nextLine().split(",");

            String productName = productDetails[0];
            long price = Long.parseLong(productDetails[1]);
            int quantity = Integer.parseInt(productDetails[2]);

            long productValue = price * quantity;

            if (productValue < lowestValue) {
                lowestValue = productValue;
                lowestValueProduct = productName;
            }
        }

        System.out.println("Product with the lowest value: " + lowestValueProduct);

        scanner.close();
    }
}
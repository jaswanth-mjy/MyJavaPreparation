package Arrays;
import java.util.*;
public class LargestSmallest {
    public static int getSmallLarge(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest=Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(largest<numbers[i])
            {
                largest=numbers[i];
            }
            if(smallest > numbers[i]){
                smallest=numbers[i];
            }

        }
        System.out.println("Smallest number is " +smallest);
        return largest;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the elements of your array");
        int numbers[]= new int [n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("largest number in your array"+getSmallLarge(numbers));
    }
}

package Arrays;
import java.util.*;

public class BinarySearch {
public static int binarySearch(int numbers[],int key){
    int start=0;int end=numbers.length-1;
    while(start<=end){
        int mid=(start+end)/2;

        if(numbers[mid]==key){
            return mid;
        }
        if(numbers[mid]>key){
            start=mid+1;
        }else{
            end=mid-1;
        }
    }
    return -1;

}
public static void reverse(int numbers[]){
    int first=0;
    int last=numbers.length-1;
    while(first<last){
        int temp=numbers[last];
        numbers[last]=numbers[first];
        numbers[first]=temp;
        first++;
        last--;
    }
}
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int numbers[] = new int[n];
        for(int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("Enter the key you want to find out: ");
        int key = sc.nextInt();

        System.out.println("The element is at the index: "+binarySearch(numbers, key));

        System.out.println("The reversed numbers are ");
        reverse(numbers);

            for(int i=0;i<n;i++){
                System.out.println(numbers[i]+" ");
            }
            System.out.println();
        

    }
}

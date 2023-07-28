package Arrays;

import java.util.Scanner;

public class MaxSubArray {
   
    public static void SubArr(int numbers[]){
         int currsum=0;
    int maxSum=Integer.MIN_VALUE;  
        int ts=0;
          for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                currsum=0;
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                    currsum+=numbers[k];
                }
                ts++;
                System.out.println();
                System.out.println(); 
       }
    System.out.println();
     }
     System.out.println("Total sub Arrays= "+ts);
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
    
        SubArr(numbers);
}
}

package Arrays;

import java.util.Scanner;

public class Pairs {
    // public static void ArrPairs(int numbers[])
    // {
    //     for(int i=0;i<numbers.length;i++){
    //         int curr=numbers[i];
    //         for(int j=i+1;j<numbers.length;j++){
    //             System.out.print("("+curr+","+numbers[j]+")");

    //         }
    //         System.out.println();
    //     }
    // }
    public static void SubArr(int numbers[]){
        int ts=0;
          for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i+1;j<numbers.length;j++){
                int end =j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts++;
                System.out.println();
    }
    System.out.println();
    System.out.println("Total sub Arrays= "+ts);
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
      //  ArrPairs(numbers);
        SubArr(numbers);
}
}

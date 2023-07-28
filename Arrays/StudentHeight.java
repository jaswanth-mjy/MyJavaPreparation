package Arrays;
import java.util.*;

class Solution{
public static int[] Order(int[] a){
   for(int i=0;i<a.length-1;i++){
    if(a[0]>a[i+1])
    {
    i++;    
    }
   }
   
    return a;

}

public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a= new int[n];

    for(int i=0;i<n;i++){
        a[i]=sc.nextInt();
    }

}
}

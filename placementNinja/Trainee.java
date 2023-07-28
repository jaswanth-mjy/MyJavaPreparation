package placementNinja;
import java.util.*;

public class Trainee {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            if(n>3){
            System.out.println("Alert do not enter more than three rounds");
            }
            if(arr[i]>=100){
                arr[i]=sc.nextInt();
            }
        
        }

    }

    public static int[] StudentsRound(int[] arr){
        
        return null;
    }
}

package AccentureCoding;
import java.util.*;
/*
 – At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
 */

public class Password {
    
    public int checkPassword(String str,int n){
        
        if(n<4)
       {
         return 0;
       }
       if(str.charAt('0')>=0 && (str.charAt('9')<=9)){
        return 0;
       }

       int num=0;int abc=0;

       for(int i =0;i<n;i++){
         if(str.charAt(i)==' ' && (str.charAt(i)=='/')){
        return 0;
       }
        if(str.charAt(i)>='A' && (str.charAt(i)<='Z')){
            abc++;
       }
        if(str.charAt(i)>='0' && (str.charAt(i)<='9')){
            num++;
       }

       }
       if(abc>0&&num>0){
        return 1;
       }
       else{
        return 0;
       }
        
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
    }
}

package NumbersTcs;
import java.util.*;
public class ArmstrongNumberChecker {
    public static boolean isArmstrongNumber(int number) {
        String numberAsString = String.valueOf(number);
        int numDigits=numberAsString.length();
        int sum=0;
        for(int i=0;i<numDigits;i++){
            int digitValue=Character.getNumericValue(numberAsString.charAt(i));
            sum+=Math.pow(digitValue, numDigits);
        }
       if(sum==number){
        return true;
       }else{
        return false;
       }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        boolean result=isArmstrongNumber(number);
        System.out.println(result);   
    }
}

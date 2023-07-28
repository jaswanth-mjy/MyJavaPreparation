//If the digit sum result is 1 display a message UNO if not diaplay a message not UNO Input: 51112 is N , 5+1+1+1+2=10,then 1+0=1 so we have print UNO 
public class UnoOrNot {
    public static void main(String[] args) {
        int number = 51112;
        int sum = 0;
        while (number > 0) {
            sum += number % 10; 
            number /= 10; 
        }
        while (sum > 9) {
            int temp = sum;
            sum = 0;
            
            while (temp > 0) {
                sum += temp % 10; 
                temp /= 10; 
            }
        }
        if (sum == 1) {
            System.out.println("UNO");
        } else {
            System.out.println("not UNO");
        }
    }
}
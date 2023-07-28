package Arrays;
import java.util.*;

public class DirectionChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String");
        String dir = sc.nextLine();
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < dir.length(); i++) {
            if (dir.charAt(i) == 'N') {
                y++;
            }
            if (dir.charAt(i) == 'E') {
                x++;
            }
            if (dir.charAt(i) == 'W') {
                x--;
            }
            if (dir.charAt(i) == 'S') {
                y--;
            }
        }
        
        if (x == 0 && y == 0) {
            System.out.println("Successful");
        } else {
            System.out.println("Not Successful");
        }
    }
}

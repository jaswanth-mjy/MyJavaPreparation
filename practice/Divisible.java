import java.util.*;

public class Divisible {
    void fuction(int n, int r1, int r2) {

        for (int i = 1; i <= n; i++) {
            if (i % 6 == 0) {
                r1 += i;
            }
        }
    }
}

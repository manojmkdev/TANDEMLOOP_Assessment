import java.util.*;

public class program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int limit = (n % 2 == 0) ? n - 1 : n;

        for (int i = 1; i <= limit; i += 2) {
            System.out.print(i);
            if (i + 2 <= limit) System.out.print(", ");
        }
    }
}

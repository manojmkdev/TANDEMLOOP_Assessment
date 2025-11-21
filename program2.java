import java.util.*;

public class program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0, num = 1; i < n; i++, num += 2) {
            System.out.print(num);
            if (i < n - 1) System.out.print(", ");
        }
    }
}

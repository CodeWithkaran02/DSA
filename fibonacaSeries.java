import java.util.*;

public class fibonacaSeries {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0, second = 1;
        int i = 1;
        while (i <= n) {
            int third = first + second;
            System.out.println(first);
            first = second;
            second = third;
            i++;
        }
    }

}

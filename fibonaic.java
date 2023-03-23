import java.util.*;

public class fibonaic {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 0, sum;
        for (int i = 0; i <= 10; i++) {
            sum = fact + i;
            System.out.println(sum);
        }

    }

}

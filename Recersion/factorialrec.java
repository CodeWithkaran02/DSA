import java.util.*;

public class factorialrec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fact(n);
        System.out.println(ans);
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        int factNum = fact(n - 1);
        int factN = n * factNum;
        return factN;

    }

}

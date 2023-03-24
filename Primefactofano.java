import java.util.*;

public class Primefactofano {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int fact = 2; fact * fact <= n; fact++) {
            while (n % fact == 0) {
                n = n / fact;
                System.out.println(fact + "");
            }
        }
        if (n != 1) {
            System.out.println(n);
        }
    }
}

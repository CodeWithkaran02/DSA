import java.util.*;

public class patten2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int nst = n + 1 - row;

            for (int i = 5; i >= row; i--) {
                System.out.print("*\t");
            }
            System.out.println(" ");
        }
    }
}

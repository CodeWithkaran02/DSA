import java.util.*;

public class patten3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            int nst = row;
            int nsp = n - nst;

            for (int i = 1; i <= nsp; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nst; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

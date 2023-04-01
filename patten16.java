import java.util.*;

public class patten16 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1, nsp = 2 * n - 1 - 2;
        int row = 1;
        while (row <= n) {
            int var = 1;
            for (int i = 1; i <= nst; i++) {
                System.out.print(var + "\t");
                var++;
            }
            for (int i = 1; i <= nsp; i++) {
                System.out.print("\t");
            }
            if (row == n)
                nst = nst - 1;

            {
                int v2 = nst;
                for (int i = 1; i <= nst; i++) {
                    System.out.print(v2 + "\t");
                    v2--;
                }
                System.out.println();
                nst++;
                nsp = nsp - 2;

            }
            row++;

        }
    }

}

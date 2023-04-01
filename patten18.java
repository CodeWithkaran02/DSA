import java.util.*;

public class patten18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n, nsp = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= nst; j++) {
                if (i > 1 && i < n / 2 + 1 && j > 1 && j < nst) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }

            }
            System.out.println();

            if (i < n / 2 + 1) {
                nsp++;
                nst = nst - 2;
            } else {
                nsp--;
                nst = nst + 2;
            }
        }
    }
}

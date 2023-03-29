import java.util.*;

public class patten17 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1, nspace = n / 2, nstar = n - nspace;
        while (row <= n) {
            for (int i = 1; i <= nspace; i++) {
                if (row == n / 2 + 1) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            for (int i = 1; i <= nstar; i++) {
                System.out.print("*\t");
            }
            System.out.println();
            if (row <= n / 2) {
                nstar = nstar + 1;

            } else {
                nstar = nstar - 1;

            }
            row++;
        }
    }
}

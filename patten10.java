import java.util.*;

public class patten10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1, nspace = n / 2, nstar = 1;

        while (row <= n) {
            for (int i = 1; i <= nspace; i++) {
                System.out.print("\t");
            }
            for (int i = 1; i <= nstar; i++) {
                if (i == 1 || i == nstar) {
                    System.out.print("*\t");
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();

            if (row <= n / 2) {
                nspace = nspace - 1;
                nstar = nstar + 2;
            } else {
                nspace = nspace + 1;
                nstar = nstar - 2;
            }
            row++;
        }

    }
}

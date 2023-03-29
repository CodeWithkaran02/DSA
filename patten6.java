import java.util.*;

public class patten6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nstar = n / 2 + 1, row = 1, nspace = 1;

        while (row <= n) {
            for (int i = 1; nstar <= n; i++) {
                System.out.print("*\t");
            }
            for (int i = 1; nspace <= n; i++) {
                System.out.print("\t");
            }
            for (row = 1; nstar <= n; row++) {
                System.out.print("*\t");
            }
            System.out.println();

            if (row <= n / 2) {
                nstar = nstar - 1;
                nspace = nspace + 2;
            } else {
                nstar = nstar + 1;
                nspace = nspace - 2;
            }
            row++;
        }
    }
}{

}

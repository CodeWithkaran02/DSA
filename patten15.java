import java.util.*;

public class patten15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1, nspace = n / 2, nstar = 1, num = 1;
        while (row <= n) {
            for (int i = 1; i <= nspace; i++) {
                System.out.print("\t");
            }
            int temp = num;
            for (int i = 1; i <= nstar; i++) {
                System.out.print(temp + "\t");
                if (i <= nstar / 2) {
                    temp = temp + 1;

                } else {
                    temp = temp - 1;

                }
            }
            System.out.println();

            if (row <= n / 2) {
                nspace = nspace - 1;
                nstar = nstar + 2;
                num = num + 1;
            } else {
                nspace = nspace + 1;
                nstar = nstar - 2;
                num = num - 1;
            }
            row++;
        }

    }
}

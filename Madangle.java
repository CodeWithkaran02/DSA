import java.util.*;

public class Madangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst1 = n, nst2 = 2 * n - 1, nst3 = 1;
        int nsp1 = 2, nsp2 = 2;

        for (int row = 1; row <= n; row++) {
            // st1
            printstar(nst1);

            // sp
            printspace(nsp1);
            // st2
            printstar(nst2);
            // sp
            printspace(nsp2);
            // star
            printstar(nst3);

            // sp
            printspace(nsp2);

            // star
            printstar(nst2);
            // space

            printspace(nsp1);

            // star
            printstar(nst1);

            nsp1++;
            nst2 = nst2 - 2;
            nst3 = nst3 + 2;
            System.out.println();

        }
    }

    public static void printstar(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print("*");

        }

    }

    public static void printspace(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(" ");
        }
    }

}

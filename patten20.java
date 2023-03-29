import java.util.*;

public class patten20 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n; col++) {
                if (col == 1 || col == n) {
                    System.out.print("*\t");
                } else if (row == col || row + col == n + 1) {
                    if (row >= n / 2 + 1) {
                        System.out.print("*\t");
                    } else {
                        System.out.print("\t");
                    }
                } else {
                    System.out.print("\t");
                }

            }
            System.out.println();

        }

    }
}

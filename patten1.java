import java.util.*;

public class patten1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int nst = row;

            for (int i = 1; i <= nst; i++) {
                System.out.print("* \t");

            }
            System.out.println();
        }

    }
}

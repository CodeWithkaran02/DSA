import java.util.*;

public class patten13 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int row = 0; row < num; row++) {
            int ncr = 0;

            for (int col = 0; col <= row; col++) {
                System.out.print(ncr + "\t");
                int n = row, r = col;

                int ncrp1 = ((n - r) * ncr) / (r + 1);

                ncr = ncrp1;

            }
        }
        System.out.println();
    }

}

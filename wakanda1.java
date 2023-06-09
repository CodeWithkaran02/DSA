import java.util.*;

public class wakanda1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int col = 0; col < m; col++) {
            // even col
            if (col % 2 == 0) {
                for (int row = 0; row < n; row++) {
                    System.out.print(arr[row][col]);
                }
            } else
                // odd col
                for (int row = n - 1; row >= 0; row--) {
                    System.out.println(arr[row][col]);
                }
        }
    }
}

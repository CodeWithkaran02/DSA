import java.util.*;

public class stateofwokada2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int gap = 0; gap < n; gap++) {
            for (int i = 0; i < n - gap; i++) {
                int j = i + gap;
                System.out.println(arr[i][j]);
            }
        }
    }
}

import java.util.*;

public class Rotateaangle {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();
        int arr[][] = new int[nr][nc];

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }
}

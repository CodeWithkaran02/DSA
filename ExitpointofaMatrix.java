import java.util.*;

public class ExitpointofaMatrix {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nr = sc.nextInt();
        int nc = sc.nextInt();

        int[][] arr = new int[nr][nc];
        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                arr[i][j] = sc.nextInt();

            }
        }

        // 0:E, 1:S, 2:W, 3:N

        int dir = 0;
        int r = 0, c = 0;
        while (r >= 0 && r < nr && c >= 0 && c < nc) {
            dir = (dir + arr[r][c]) % 4;
            if (dir == 0) {
                c += 1;

            } else if (dir == 1) {
                r += 1;
            } else if (dir == 2) {
                c -= 1;

            } else {
                r -= 1;

            }
        }
        if (dir == 0) {
            c -= 1;

        } else if (dir == 1) {
            r -= 1;
        } else if (dir == 2) {
            c += 1;

        } else {
            r += 1;

        }

        System.out.println(r);
        System.out.println(c);
    }
}

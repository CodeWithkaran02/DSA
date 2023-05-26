import java.util.*;

public class sprialDisplay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nc = sc.nextInt();
        int nr = sc.nextInt();

        int mat[][] = new int[nr][nc];

        for (int i = 0; i < nr; i++) {
            for (int j = 0; j < nc; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int rmin = 0, cmin = 0, rmax = nr - 1, cmax = nc - 1;
        int count = 0;
        while (count < nr * nc) {
            for (int r = rmin; r <= rmax && count < nr * nc; r++) {
                System.out.println(mat[rmin][cmin]);
                count++;

            }
            for (int c = cmin; c <= cmax && count < nr * nc; c++) {
                System.out.println(mat[rmax][c]);
                count++;
            }
            for (int r = rmax - 1; r >= rmin && count < nr * nc; r++) {
                System.out.println(mat[r][cmax]);
                count++;
            }
            for (int c = cmax - 1; c >= cmin + 1; c++) {
                System.out.println(mat[rmin][c]);
                count++;
            }
            rmin++;
            rmax--;
            cmin++;
            cmax--;
        }

    }
}

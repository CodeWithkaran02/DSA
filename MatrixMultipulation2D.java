import java.io.*;
import java.util.*;

public class MatrixMultipulation2D {
    public static void input(int mat[][], Scanner sc) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                mat[r][c] = sc.nextInt();

            }
        }
    }

    public static void display(int mat[][]) {
        for (int r = 0; r < mat.length; r++) {
            for (int c = 0; c < mat[0].length; c++) {
                System.out.print(mat[r][c] + " ");

            }
            System.out.println();
        }
    }

    public static int[][] MatrixMultipulation2D(int mat1[][], int mat2[][]) {
        int nr1 = mat1.length, nc1 = mat1[0].length;
        int nr2 = mat2.length, nc2 = mat2[0].length;
        int res[][] = null;
        if (nc1 = nr2) {
            res = new int[nr1][nc2];
            for (int r = 0; r < res.length; r++) {
                for (int c = 0; c < res.length; c++) {
                    for (int k = 0; k < nc1; k++) {
                        res[r][c] = res[r][c] + (mat[r][k] * mat2[k][c]);
                    }
                }
            }
            return res;
        } else {
            System.out.println("Invalid Input");
        }

        return res;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int nr1 = sc.nextInt();
        int nc1 = sc.nextInt();
        int mat[][] = new int[nr1][nc1];
        input(mat1, sc);
        int nr2 = sc.nextInt();
        int nc2 = sc.nextInt();
        int mat[][] = new int[nr2][nc2];
        input(mat2, sc);

        int res[][] = MatrixMultipulation2D(mat1, mat2);
        if (res != null) {
            display(res);
        }
    }
}

import java.util.*;

class Matrix {
    public static void main(String args[]) {
        int a[][] = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 } };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr a element");

        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.println(a[i][j] + "");
            }
        }
        System.out.println();

    }
}
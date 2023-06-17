import java.util.*;

class iretion1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncrese(n);

    }

    public static void printIncrese(int n) {
        if (n == 0) {
            return;
        }
        printIncrese(n - 1);
        System.out.println(n);
    }
}
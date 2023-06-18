import java.util.*;

public class PrintDecreasing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        PrintDecreasingOrder(n);
    }

    public static void printIncrese(int n) {
        if (n == 0) {
            return;
        }

        printIncrese(n - 1);
        System.out.println(n);
    }

    public static void PrintDecreasingOrder(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        PrintDecreasingOrder(n - 1);
    }
}

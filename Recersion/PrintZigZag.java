import java.util.*;

public class PeintZigZag {

    public static void main(String args[]) {
        pzz(new Scanner(System.in).nextInt());
    }

    public static void pzz(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }
}

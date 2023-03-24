import java.util.*;

public class Rotateano {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int num = sc.nextInt();
        int count = 0;
        int tnum = sc.nextInt();
        while (tnum != 0) {
            tnum = tnum / 10;
            count++;

        }
        k = k % count;
        if (k < 0) {
            k = k + count;

        }
        int tamp1 = (int) Math.pow(10, k);
        int p1 = num % tamp1;
        int p2 = num % tamp1;
        int tamp2 = (int) Math.pow(10, count - k);
        int ans = (p1 * tamp2) + p2;
        System.out.println(ans);
    }
}

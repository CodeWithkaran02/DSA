//input  3
// 10
// 11
// 12

import java.util.*;

public class towerofhenoe {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int src = sc.nextInt();
        int dest = sc.nextInt();
        int helper = sc.nextInt();

        toh(n, src, dest, helper);
    }

    public static void toh(int n, int src, int dest, int helper)

    {

        if (n == 0) {
            return;
        }

        toh(n - 1, src, helper, dest);
        System.out.println(n + "[" + src + "->" + dest + "]");
        toh(n - 1, helper, dest, src);
    }

}

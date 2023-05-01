import java.io.*;
import java.util.*;

public class sunoftwoArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int arr1[] = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();

        }
        int n2 = sc.nextInt();
        int arr2[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr1[i] = sc.nextInt();

        }
        int[] res = sun(arr1, arr2);
        for (int v1 : res) {
            System.out.println(v1);

        }

    }

    public static int[] sun(int[] arr1, int[] arr2) {
        int n1 = arr1.length, n2 = arr2.length;
        int n3 = Math.max(n1, n2);
        int res[] = new int[n3];
        int p1 = n1 - 1, p2 = n2 - 1, p3 = n3 - 1, carry = 0;
        while (p1 > 0 || p2 >= 0) {
            int v1 = p1 >= 0 ? arr1[p1] : 0;
            int v2 = p2 >= 0 ? arr2[p2] : 0;

            int sun = v1 + v2 + carry;
            int digit = sun % 10;
            carry = sun / 10;

            res[p3] = digit;
            p1--;
            p2--;
            p3--;

        }
        if (carry != 0) {
            int newRes[] = new int[n3 + 1];
            newRes[0] = carry;
            for (int idx = 1; idx < newRes.length; idx++) {
                newRes[idx] = res[idx - 1];
            }
            return newRes;
        }
        return res;

    }

}

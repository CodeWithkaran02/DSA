import java.io.*;
import java.util.*;

public class firstindexandlastindex {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int data = sc.nextInt();
        int fi = Firstindex(arr, data);
        int li = lastindex(arr, data);

        System.out.println(fi);
        System.out.println(li);

    }

    public static int Firstindex(int[] a, int d) {
        int ans = -1;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] > d) {
                right = mid - 1;

            } else if (a[mid] < d) {
                left = mid + 1;

            } else {
                ans = mid;
                right = mid - 1;
            }

        }
        return ans;

    }

    public static int lastindex(int[] a, int d) {
        int ans = -1;
        int left = 0;
        int right = a.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] > d) {
                right = mid - 1;

            } else if (a[mid] < d) {
                left = mid - 1;

            } else {
                ans = mid;
                left = mid + 1;

            }

        }
        return ans;

    }
}
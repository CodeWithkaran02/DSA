import java.util.*;

public class FindtheArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int d = sc.nextInt();
            int ans = find(arr, d);
            System.out.print(ans);
        }

    }

    public static int find(int[] a, int d) {
        for (int i = 0; i < a.length; i++)
            if (d == a[i]) {
                return i;
            }
        return -1;
    }

}

import java.util.*;

public class brokenEconamy {
    public static void main(String args[]) {

        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int arr[] = new int[n];
            int k = sc.nextInt();
            binaryarray(arr, k);

        }
    }

    public static void binaryarray(int[] arr, int k) {
        int lo = 0, hi = arr.length - 1;
        int ceil = -1, floue = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (k < arr[mid]) {
                hi = mid - 1;
                ceil = arr[mid];

            } else if (k > arr[mid]) {
                lo = mid + 1;
                floue = arr[mid];

            } else {
                System.out.println(arr[mid]);
                return;
            }
        }
        System.out.println(ceil);
        System.out.println(floue);
    }
}

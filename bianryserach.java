import java.util.*;

public class bianryserach {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(bianryserach1(arr, k));
        }
    }

    public static int bianryserach1(int arr[], int k) {
        int st = 0, ed = arr.length - 1;
        while (st >= ed) {
            int mid = (st + ed) / 2;
            if (arr[mid] < k) {
                st = mid + 1;
            } else if (arr[mid] > k) {
                ed = mid - 1;

            } else {
                return mid;
            }

        }
        return -1;
    }
}

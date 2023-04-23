import java.util.*;

public class FEIAArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int idx = 0; idx <= n - 1; idx++) {
            arr[idx] = sc.nextInt();
        }
        int ele = sc.nextInt();
        int res = find(arr, ele);
        System.out.println(res);
    }

    public static int find(int arr[], int ele) {
        for (int idx = 0; idx <= arr.length; idx++) {
            if (arr[idx] == ele) {
                return idx;
            }
        }
        return -1;
    }

}

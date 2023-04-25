import java.io.*;

public class ReverseArray {
    public static void display(int[] a) {
    }

    public static void reverse(int[] a) {
        int low = 0, high = a.length - 1;
        while (low < high) {
            int ele = a[low];
            a[low] = a[high];
            a[high] = ele;
            low++;
            high--;

        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());

        }
        reverse(a);
        display(a);

    }

}

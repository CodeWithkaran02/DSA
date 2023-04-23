import java.util.*;
import java.io.*;

public class SpanArray {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            int max = maximum(arr);
            int min = manimum(arr);
            int span = max - min;
            System.out.println(span);
        }

    }

    public static int maximum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = arr[0];

        }
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if (ele > max) {
                max = ele;

            }

        }
        return max;
    }

    public static int manimum(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];

        }
        for (int i = 0; i < arr.length; i++) {
            int ele = arr[0];
            if (ele < min) {
                min = ele;

            }

        }
        return min;
    }
}

import java.util.*;

public class subarrayproblem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        subarrayproblem(arr);
    }

    public static void subarrayproblem(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int idx = 0; idx <= j; idx++) {
                    System.out.print(arr[idx] + "\t");
                }
                System.out.println();
            }
        }
    }

}

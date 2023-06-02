import java.util.*;

class SaddlePrise {
    public static boolean check(int [][]arr,int ci , int ele){
        for(int i=0; i<arr.length; i++){
            for(arr[i][ci] > ele)
            {
                return false;

            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        for (int r = 0; r < n; r++) {
            int ele = arr[r][c];
            ci = c;

        }

        boolean ans = check(arr, ci, ele);
        if (ans == true) {
            System.out.println(ele);
        }
        System.out.println("Invalid input");
    }
}

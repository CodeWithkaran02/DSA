//leet code question just try in our vs code write 
//import java.util.*;

public class search {
    public search(int arr[], int ele) {
        // Scanner sc = new Scanner(System.in);
        // int n = nextInt();
        // arr = new int[n];
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == ele) {
                return mid;

            } else if (arr[mid] > ele) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

}

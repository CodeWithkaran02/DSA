import java.util.*;

class perfactNumber {
    public static void main(String args[]) {
        int n;
        int i = 1;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        n = sc.nextInt();
        while (i < n) {
            if (n % i == 0) {
                sum = sum + i;
            }
            if (sum == n) {
                System.out.println(i + "Is perfactNumber:");
            } else {
                System.out.println(i + "Is not perfactNumber:");
            }

        }

    }
}
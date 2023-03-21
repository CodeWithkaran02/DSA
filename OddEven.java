import java.util.*;

class OddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rem = n % 2;
        if (rem == 1) {
            System.out.println("Number is odd:");

        } else {
            System.out.println("Number is Even:");
        }
    }
}
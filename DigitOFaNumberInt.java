import java.util.*;

class DigitOFaNumberInt {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copyOfN = n;
        int temp = 1;
        while (copyOfN > 9) {
            copyOfN = copyOfN / 10;
            temp = temp * 10;

        }
        while (temp != 0) {
            int digit = n / temp;
            System.out.println(digit);
            n = n % temp;
            temp = temp / 10;
        }
    }
}
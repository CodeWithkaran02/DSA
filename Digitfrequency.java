import java.util.*;

public class Digitfrequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int f = Digitfrequency(n, d);
        System.out.println(f);

    }

    public static int Digitfrequency(int n, int d) {
        int count = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem == d) {
                count++;
            }
            n = n / 10;
        }
        return count;
    }
}
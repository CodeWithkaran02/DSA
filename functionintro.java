import java.util.*;

public class functionintro {

    public static int add1(int n1, int n2) {
        int ans1 = n1 + n2;
        System.out.println(ans1);

    }

    public static int add2(int n1, int n2) {
        int ans = n1 + n2;
        return ans;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        add2(num1, num2);

    }
}

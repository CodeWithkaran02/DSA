import java.util.*;

public class HW1 {
    public static void main(String[] xyz) {
        int a, b, c, d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter all three Number:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println(" Largest Number :" + d);
    }

}

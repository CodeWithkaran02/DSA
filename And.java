import java.util.*;

public class And {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0 && n < 10) {
            System.out.println("Input valid ");
        } else {
            System.out.println("Input Invalid");
        }
    }

}

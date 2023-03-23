import java.util.*;

public class improveprimecode {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                flag = 0;
                break;

            }
        }
        if (flag == 1) {
            System.out.println("Prime");
        } else {
            System.out.println("Not prime ");
        }
    }

}

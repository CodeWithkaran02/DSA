import java.util.*;

public class togglecase {
    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                char uc = (char) ((ch - 'a') + 'A');
                sb.append(uc);

            } else if (ch >= 'A' && ch <= '2') {
                char lc = (char) ((ch - 'A') + 'a');
                sb.append(lc);

            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(toggleCase(str));
    }
}

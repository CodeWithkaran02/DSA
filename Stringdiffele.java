import java.util.*;

// pepcoding 
public class Stringdiffele {
    public static String solution(String str) {
        StringBuilder sb = new StringBuilder();
        char c = str.charAt(0);
        sb.append(c);

        for (int i = 1; i < str.length(); i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);

            int diff = curr - prev;

            sb.append(diff);
            sb.append(curr);

        }
        return sb.toString();

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}

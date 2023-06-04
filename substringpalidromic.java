import java.util.*;

public class substringpalidromic {
    public static boolean ispalidrom(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) == s.charAt(right)) {
                left++;
                right--;

            } else {
                return false;

            }
        }
        return true;

    }

    public static void palindromicsubstring(String str) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String ss = str.substring(i, j);
                if (ispalidrom(ss)) {
                    System.out.println(ss);

                }
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        palindromicsubstring(str);
    }
}

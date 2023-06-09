import java.util.*;

public class RemovePrime {
    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;

            }

        }
        return true;

    }

    public static void solution(ArrayList<Integer> al) {
        int n = al.size();
        for (int i = n - 1; i >= 0; i--) {
            int num = al.get(i);

            if (isPrime(num) == true) {
                al.remove(i);
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());

        }
        solution(al);
        System.out.println(al);
    }
}

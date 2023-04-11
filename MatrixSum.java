import java.util.*;

class MatrixSum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a element ");
        int x = sc.nextInt();
        int a[] = new int[x];
        int oddsum = 0;
        int evenodd = 0;

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            if (a[j] % 2 == 0) {
                evenodd = oddsum + a[j];

            } else {
                oddsum = oddsum + a[j];

            }
            System.out.println("Sum of Even Number is :=" + evenodd);
            System.out.println("Sum of Odd Nymber is := " + oddsum);
        }

    }
}
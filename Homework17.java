import java.util.*;

class Homework17 {
    public static void main(String args[]) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year");
        year = sc.nextInt();

        if ((year % 4 == 0 && (year % 400 == 0 || year % 100 == 0))) {
            System.out.println("%leap year");
        } else {
            System.out.println("Is not leap year ");
        }
    }
}

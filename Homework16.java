import java.util.*;

class Homework16 {
    public static void main(String args[]) {
        float a, l, b, h, surfacearea;
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the three no.");
        System.out.println("Enter the value l:");
        l = sc.nextInt();
        System.out.println("Enetr the value b:");
        b = sc.nextInt();
        System.out.println("Enter the value h:");
        h = sc.nextInt();

        a = l = b = h;
        surfacearea = 6 * (a * a);

        System.out.println(surfacearea);

    }
}
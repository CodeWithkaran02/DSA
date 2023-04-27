import java.util.Scanner;

class SQ1 {
    public static void main(String abc[]) {
        int length, area;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square ::");
        length = sc.nextInt();
        area = length * length;

        System.out.println("Area of square is ::" + area);

    }
}
import java.util.Scanner;

class ChackNumber {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int num1 = sc.nextInt();
      int num2 = sc.nextInt();
      if (num1 == num2) {
         System.out.println("Both are equal:");
      } else if (num1 < num2) {
         System.out.println("num1 is gretar than num2");
      } else {
         System.out.println("num1 is smaller than num2");
      }
   }
}
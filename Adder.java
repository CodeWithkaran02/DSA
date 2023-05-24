class Adder {
    static int add(int a, int b) {
        return a + b;

    }

    static double add(double a, double b) {
        return a + b;

    }

    class textOverloadding2 {
        public static void main(String args[]) {
            System.out.println(Adder.add(11, 11));
            System.out.println(Adder.add(12.6, 12.6));

        }
    }
}
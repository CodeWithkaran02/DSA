import java.util.*;

class Salary {
    public static void main(String[] args) {
        int bs, da, tx, ta, tra, gs, hs, tax;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enetr the Salary");
        bs = Sc.nextInt();
        if (bs >= 20000) {
            da = bs * 60 / 100;
            ta = bs * 40 / 100;
            tra = bs * 10 / 100;

        } else {
            da = bs * 50 / 100;
            ta = bs * 30 / 100;
            tra = 700;

        }
        tx = bs * 10 / 100;
        gs = bs + da + ta + tra;
        hs = gs - tx;

    }
}
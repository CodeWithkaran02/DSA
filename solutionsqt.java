//from leet code 

import java.lang.*;

public class solutionsqt {

    public int mysqt(int x) {
        if (x < 2) {
            return x;
        }
        int left = 0, right = x / 2;
        int mid = left + (right + left) / 2;
        long currsqure = (long) mid * mid;

        if (currsqure > x) {
            right = mid - 1;
        } else if (currsqure < x) {
            left = mid + 1;
        } else {
            return mid;

        }
        return -1;
    }
}

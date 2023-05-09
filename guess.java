public class guess {
    public int guessNumber(int n) {
        int left = 1, right = n;
        while (left <= right) {
            int randomNum = left + (right - left) / 2;
            if (guessNumber(randomNum) == 0) {
                return randomNum;
            } else if (guessNumber(randomNum) == 1) {
                left = randomNum + 1;
            } else {
                right = randomNum - 1;
            }

        }
        return -1;
    }
}
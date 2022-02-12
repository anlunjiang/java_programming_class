package challenges;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if ((first < 10) || (second < 10)) {
            return -1;
        }
        int maxDivisor = -1;
        for (int i = 1 ; i <= first ; i++) {
            if ((first % i == 0) && (second % i == 0)) {
                if (i > maxDivisor) {
                    maxDivisor = i;
                }
            }
        }
        return maxDivisor;
    }

    public static void main(String[] args) {
        int ret = getGreatestCommonDivisor(13, 15);
        System.out.println(ret);
    }
}

package challenges;

public class FlourPackProblem {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if(bigCount * 5 + smallCount < goal) {
            return false;
        }
        return (goal % 5 <= smallCount);
    }

    public static void main(String[] args) {
        boolean ret = canPack(2, 2, 11);
        System.out.println(ret);
    }
}

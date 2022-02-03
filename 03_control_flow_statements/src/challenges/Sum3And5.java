package challenges;

public class Sum3And5 {

    public static void fizzBuzz() {

        int sumFizzBuzz = 0;
        int numFound = 0;

        for (int i = 1; i <= 1000; i++) {
            if (numFound == 5) {
                System.out.println("Max number found");
                break;
            }
            if ((i % 3 == 0) && (i % 5 == 0)) {
                sumFizzBuzz += i;
                numFound += 1;
                System.out.println(i);
            }
        }
        System.out.println("Total Sum: " + sumFizzBuzz);
    }
    public static void main(String[] args) {
        fizzBuzz();
    }
}

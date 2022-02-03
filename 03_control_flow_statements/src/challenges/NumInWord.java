package challenges;

import java.util.HashMap;
import java.util.Map;

public class NumInWord {

    public static Map<Integer, String> produceDayMapping() {
        Map<Integer, String> numbers = new HashMap<>();

        numbers.put(0, "ZERO");
        numbers.put(1, "ONE");
        numbers.put(2, "TWO");
        numbers.put(3, "THREE");
        numbers.put(4, "FOUR");
        numbers.put(5, "FIVE");
        numbers.put(6, "SIX");
        numbers.put(7, "SEVEN");
        numbers.put(8, "EIGHT");
        numbers.put(9, "NINE");

        return numbers;
    }

    public static void printNumberInWord(int number) {
        Map<Integer, String> dayMapping = produceDayMapping();
        System.out.println(dayMapping.getOrDefault(number, "OTHER"));
    }

    public static void printNumberInWordArrays(int number) {
        String[] array = {
            "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE"
        };
        if (number >= 0 && number <= 9) {
            System.out.println(array[number]);
        } else {
            System.out.println("OTHER");
        }
    }

    public static void main(String[] args) {
        printNumberInWord(99);
        printNumberInWordArrays(9);
    }
}

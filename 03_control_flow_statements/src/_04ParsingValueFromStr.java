public class _04ParsingValueFromStr {
    /** Convert a string into another dtype such as int
     * depending on the parse type
     * */
    public static void main(String[] args) {
        String numAsString = "2022";
        System.out.println("numAsStr: " + numAsString);

        int numAsInt = Integer.parseInt(numAsString);
        // Integer is a wrapper class for the primitive dtype int
        // It has some useful methods such as parseInt

        // Can do back to string as well
        numAsString = Integer.toString(numAsInt);

        // This is useful for doing operations on string representations of ints
        numAsInt += 1;
        numAsString += 1;

        System.out.println(numAsInt); // 2023 : actually increments
        System.out.println(numAsString); // 20221 : just appends to string

        // Also works for double - or float, long for that matter
        numAsString = "2022.123";
        double number = Double.parseDouble(numAsString);
        System.out.println(number); // 20221.0

        // These are all wrapper classes
    }
}

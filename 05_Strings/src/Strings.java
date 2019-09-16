public class Strings {

    public static void main(String[] args) {

        // Soo far these are the known datatypes in Java
        // most common labelled by *

        // byte
        // short
        // int *
        // long
        // float
        // double *
        // char
        // boolean *

        // These are primitive data types (meaning they are the encoded into the java language)

        // String - Capitalized - not a datatype but a class
        int xstring = 12;
        String xint = "21";
        System.out.println("The string is " + xint);
        // int is converted to string
        System.out.println(xint + xstring);
        // converts ints to string automatically - always

        // Operations with strings automatically convert other data types to strings
        // Strings are immutable - new assignments of a string variable are new object
        // old object is discarded from memory
        // This is very inefficient (+=) - StringBuffer is mutable - later in course
    }
}

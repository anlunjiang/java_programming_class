public class Hello {
// public is an access modifier - how other code can access this
    public static void main(String[] args) {
        // main method is the entry point for any java code
        // void - method returns nothing
        System.out.println("Hello, World! This is my first java programme, Cool Beans");

        // in Java, always initialise a variable before using
        // assignment is optional
        int a;
        a = 2;
        System.out.println(a);

        int x = 5 + 10;
        int y = 12;
        int z = 6;

        int total = x * y * z;
        // Unlike python, each variable needs to have the type assigned
        System.out.println(total);

    }
}

// System.out.println("Print your example code here");

// java programs need to be compiled into a class file
// Class files are readable by the computer from the source file
// compile by inputting javac hello_world.java
// execute by: java Hello

// VARIABLES
// Need to first assign data type - then the name, then value

// CamelCase
// Java variables are conventionally typed in camelCaseLikeThis


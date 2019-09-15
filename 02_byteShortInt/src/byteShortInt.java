public class byteShortInt {
        // public class should be the same name as the name.java
    public static void main(String[] args) {
        // in Java, always initialise a variable before using
        // assignment is optional
        int a;
        a = 2;
        System.out.println(a);

        int x = -2_147_483_648; // This number is called a literal, expressions include operators
        // Data type int (2.147 B +-) Allocation on computer memory
        // > abs(2147483648 )and intelliJ will give you a data error
        // width of 32 (2^32)

        System.out.printf("This is an integer: %d", x ); // triggered by souf
        // JDK ignores the underscores for lines as it knows it is for readability
        // formatted strings rule above

        byte xByte = -128;
        // Byte ranges from -128 to +128 (More efficient to use, smaller allocated memory)
        // width of 8 (2^8)

        short xShort = 32767;
        // Short ranges from -32768 to +32767
        // width of 16 (2^16)

        long xLong = 9_223_372_036_854_775_807L;
        // Width of 64 (2^64)
        // Long literals should end with capital L

        System.out.printf("\nThis is the largest short: %d", xShort);
        System.out.printf("\nThis is the largest byte: %d", xByte);
        System.out.printf("\nThis is the largest long: %d", xLong);

        byte yByte = (byte) (xByte / 2);
        long newLong = xByte / 2;
        // java automatically casts byte and short into integer after arithmetic
        // cast it back to byte to fit with defined variable yByte
        // But Long automatically converts to long, no need to cast

        // Good to just work with ints when possible

        System.out.printf("\n%d divided by 2 == %d", xByte, yByte);
        System.out.printf("\nLong is automatically converted: %d", newLong);

    }
}
public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {

        if (kiloBytes >= 0) {
            int mb = kiloBytes / 1024;
            int kb = kiloBytes % 1024;
            System.out.printf("%d KB = %d MB and %d KB", kiloBytes, mb, kb);
        } else {
            System.out.printf("Invalid Value");
        }
    }

}
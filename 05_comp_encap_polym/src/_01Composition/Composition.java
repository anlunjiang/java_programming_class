package _01Composition;

public class Composition {
    // Composition.Composition is to do with relationship - of components modelled as a whole
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20 ,5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27inchBeast", "Acer", 27, new Resolution(1920, 1080));
        // You can create new objects on the fly like this instead of assigning to variable
        Motherboard mb = new Motherboard("ASD", "ASUS", 4, 6, "v2.44");

        PC pc = new PC(theCase, monitor, mb);
        //You have now created a custom pc class with custom components - composition!
//        pc.getTheCase().pressPowerButton();
//        pc.getMonitor().drawPixelAt(1, 2, "Red");
        // Using getters you can access methods by chaining them through the components
//        pc.getMotherboard().loadProgram("Windows 11 "); // Since the pc might not want you to have direct
        // access to monitors or cases etc - you can abstract the functionality by makiing getters private
        // and only allowing public operations the user should be able to do (e.g power up pc)

        pc.powerUp();
    }
}

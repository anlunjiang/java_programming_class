package _01Composition;

public class Monitor {
    private String model;
    private String manufacturer;
    private int size;
    private Resolution nativeRes;

    public Monitor(String model, String manufacturer, int size, Resolution nativeRes) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeRes = nativeRes;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + ", " + y + " in colour " + color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeRes() {
        return nativeRes;
    }
}

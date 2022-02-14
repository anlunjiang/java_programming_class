public class _01Classes {
    public static void main(String[] args) {
        _01ClassesCar porsche = new _01ClassesCar();
        _01ClassesCar bmw = new _01ClassesCar();
        // Instantiated the class and called the new object porsche
        // All classes inherit from a base class and therefore have base methods
        // like .equals, .toString() etc
        // Note no private variables are visible since they are private

        // Therefore, you call the set model
        System.out.println("model is now " + porsche.getModel());
        // Note that default values are null (None in python)

        porsche.setModel("Carrera");
        System.out.println("model is now " + porsche.getModel());
    }
}

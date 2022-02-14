import java.util.Locale;

public class _01ClassesCar {
    // String is a class Datatype - and therefore has some useful methods
    // primitive datatypes won't have any

    // public - access modifier
    // public - unrestricted access to the class
    // private - no other class can access this class denoted private
    // protected - classes only in this package to access this class

    // this is a class or member variable - or commonly known as fields
    // as a general rule - fields are private - it is ENCAPSULATED
    // no outside can access this field
    // Basically the __init__ of a python class
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    /**
     * "this" is = "self" in python! for each field you should have setters and getters if required
     * This is the pattern you should use instead of making fields public and accessing directly
     */
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("911")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }

        // Getters and Setters are useful for on the fly validation on custom rules
    }

    // This is a getter and is useful!
    public String getModel() {
        return this.model;
    }

    // NOTE AND IMPORTANT = IntelliJ can generate getters and setters automagically
    // in the menu go to code - generate - getters and setters and select all the fields
    // You want
}

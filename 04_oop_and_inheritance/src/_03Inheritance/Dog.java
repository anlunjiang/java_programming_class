package _03Inheritance;

import javax.swing.text.StringContent;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    // In java, you inherit by using the "extends" keyword
    // Once you inherit a class you HAVE to call the constructor for that class
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.tail = tail;
        this.coat = coat;
    }

    // Not all animals chew - but dogs do
    private void chew() {
        System.out.println("Dog.chew() Call");
    }


    // Overriding means taking an existing super class method and creating a custom
    // method of the same name in your child class
    @Override
    public void eat() {
        System.out.println("Overrided Eat = Dog.eat call ");
        chew();
        // Dog chews first - and only then does the Super Animal class eat method
        super.eat();

        // Good for putting extra functionality into methods
    }
}

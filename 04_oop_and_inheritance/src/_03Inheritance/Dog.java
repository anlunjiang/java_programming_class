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

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called moving at : " + speed);
    }
    public void walk() {
        System.out.println("Dog.walk() called");
        move(3);
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
        // Notice i'm using the inherited instance of the move method instead of super.move()
        // THIS is because if I override the move method I can still call it - instead of
        // statically only referencing the base Animal class move method

        // Hence when move() is called - overrided into it is a Dog characteristic of moveLegs
        // However if move isnt found - it will by default look at your parent class for the move() method!
    }
}

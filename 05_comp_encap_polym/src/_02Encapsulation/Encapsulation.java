package _02Encapsulation;

public class Encapsulation {
    // Encapsulation allows you to restruct access to certain components in objects
    // This ensures that certain classes only are allowed the minimum access required
    // to other classes to function
    public static void main(String[] args) {
        Player player = new Player();
        //player.getHealth()

        // With the proper encapsulation - then your code cannot be changed outside of the
        // designed way to do things - e.g. you cannot change the health because the field is
        // private
        player.loseHealth(10);

        // Encapsulation is aslso very good for refactoring - where other classes
        // dont care what internal or private fields are called
        // They only care about the public methods
    }
}

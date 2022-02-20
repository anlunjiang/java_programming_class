package _02Encapsulation;

public class Player {
    private String name;
    private int health;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;
        if (health > 0 && health <= 100) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public Player() {
        this("NPC", 100, "Sword");
    }

    public void loseHealth(int damage) {
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player fainted");
        }
    }

    public int getHealth() {
        return health;
    }
}

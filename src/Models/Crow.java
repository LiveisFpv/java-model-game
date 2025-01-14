package Models;

public class Crow {
    private Environment env;

    public Crow(Environment env) {
        this.env = env;
    }

    public void attack(Character target) {
        target.health -= 100;
        System.out.println("Crow attacks " + target.name + "! Remaining health: " + target.health);
    }
}

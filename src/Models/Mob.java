package Models;

public class Mob extends Character {
    private Environment currentEnv;

    public Mob(String name, int health, Environment env) {
        super(name, health);
        this.currentEnv = env;
    }

    public String checkPlace() {
        return name + " observes: " + currentEnv;
    }

    public void move(Environment newEnv) {
        this.currentEnv = newEnv;
        System.out.println(name + " moves to " + newEnv);
    }

    @Override
    public void act() {
        System.out.println(name + " takes no specific action.");
    }
}

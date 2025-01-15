package Models;

public class Mob extends Character {
    private Environment currentEnv;
    private Position currentPosition;
    public Mob(String name, int health, Environment env) {
        super(name, health);
        this.currentEnv = env;
        this.currentPosition = new Position(0,0);
    }

    public String checkPlace() {
        return name + " observes: " + currentEnv+" " + currentPosition;
    }

    public void move(Environment newEnv,Position newPosition) {
        this.currentEnv = newEnv;
        this.currentPosition = newPosition;

        System.out.println(name + " moves to " + newEnv);
    }

    @Override
    public void act() {
        System.out.println(name + " takes no specific action.");
    }
}

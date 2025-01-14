package Models;

public class Cannibal extends Mob implements Singable {
    public Cannibal(String name, int health, Environment env) {
        super(name, health, env);
    }
    @Override
    public void sing() {
        System.out.println(name + " sings song.");
    }
    @Override
    public void act() {
        System.out.println(name + " roams the area, looking for prey.");
    }
}

package Models;

import java.util.ArrayList;

public class Hunter extends Mob implements Singable {
    private ArrayList<Crow> crows;

    public Hunter(String name, int health, Environment env) {
        super(name, health, env);
        this.crows = new ArrayList<>();
    }

    public void spawnCrow(Environment env) throws InvalidActionException {
        if (crows.size() >= 5) {
            throw new InvalidActionException("Cannot summon more than 5 crows!");
        }
        Crow crow = new Crow(env);
        crows.add(crow);
        System.out.println(name + " summons a crow at " + env);
    }

    @Override
    public void sing() {
        System.out.println(name + " sings softly.");
    }

    @Override
    public void act() {
        System.out.println(name + " is planning an action.");
    }
}

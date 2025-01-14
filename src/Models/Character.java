package Models;
public abstract class Character {
    protected String name;
    protected int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public String getName() {
        return name;
    }

    public abstract void act();

    @Override
    public String toString() {
        return name + " [health=" + health + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Character other = (Character) obj;
        return name.equals(other.name) && health == other.health;
    }

    @Override
    public int hashCode() {
        return name.hashCode() + Integer.hashCode(health);
    }
}
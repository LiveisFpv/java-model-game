import java.util.Random;

import Models.Cannibal;
import Models.Crow;
import Models.Environment;
import Models.Hunter;
import Models.InvalidActionException;

public class App {
    public static void main(String[] args) {
        try {
            Hunter valkom = new Hunter("Valkom", 100, Environment.HOME);
            Cannibal ogre = new Cannibal("Ogre", 100, Environment.CASTLE);

            System.out.println(valkom.checkPlace());
            ogre.move(Environment.FOREST);
            ogre.sing();
            System.out.println(ogre.checkPlace());
            valkom.move(Environment.FOREST);
            valkom.sing();
            System.out.println(valkom.checkPlace());
            Random random = new Random();
            if (random.nextBoolean()) {
                valkom.spawnCrow(Environment.FOREST);
                Crow crow = new Crow(Environment.FOREST);
                crow.attack(ogre);

                if (ogre.getHealth() <= 0) {
                    System.out.println(ogre.getName() + " has died!");
                }
            }
        } catch (InvalidActionException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception ex) {
            System.err.println("An unexpected error occurred: " + ex.getMessage());
        }
    }
}

package level;

import java.util.ArrayList;
import java.util.List;
import enemies.*;
import items.*;
import java.util.Random;

public class LevelManager {
    private int currentLevel;
    private List<Enemy> enemies;
    private Random random;

    public LevelManager() {
        this.currentLevel = 1;
        this.enemies = new ArrayList<>();
        this.random = new Random();
        initializeLevel();
    }

    public void initializeLevel() {
        enemies.clear();

        List<Enemy> availableEnemies = new ArrayList<>();
        availableEnemies.add(new Skeleton());
        availableEnemies.add(new Zombie());
        availableEnemies.add(new Creeper());

        int numEnemies = random.nextInt(3) + 1;

        for (int i = 0; i < numEnemies; i++) {
            enemies.add(availableEnemies.get(random.nextInt(availableEnemies.size())));
        }
    }

    public void advanceLevel() {
        this.currentLevel++;
        initializeLevel();
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }
}

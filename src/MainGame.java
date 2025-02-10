import player.Player;
import combat.CombatManager;
import items.ItemManager;
import level.LevelManager;
import score.ScoreManager;
import enemies.Enemy;

import java.util.Random;

public class MainGame {
    public static void main(String[] args) {
        Player player = new Player("Adventurer");
        CombatManager combatManager = new CombatManager();
        ItemManager itemManager = new ItemManager();
        LevelManager levelManager = new LevelManager();
        ScoreManager scoreManager = new ScoreManager();

        while (player.getHealth() > 0 && levelManager.getCurrentLevel() <= 3) {
            System.out.println("=== Level " + levelManager.getCurrentLevel() + " ===");
            for (Enemy enemy : levelManager.getEnemies()) {
                combatManager.fight(player, enemy);
            }

            itemManager.pickUpItem(player);
            scoreManager.displayScore(player);
            levelManager.advanceLevel();
        }

        if (player.getHealth() <= 0) {
            System.out.println(player.getName() + " has perished. Game Over.");
        } else {
            System.out.println("Congratulations, " + player.getName() + "! You completed the adventure with " + player.getExperience() + " experience points!");
        }
    }
}

package player;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private int health;
    private int experience;
    private List<String> inventory;

    public Player(String name) {
        this.name = name;
        this.health = 100;
        this.experience = 0;
        this.inventory = new ArrayList<>();
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
    }

    public void gainExperience(int experience) {
        this.experience += experience;
    }

    public void addItemToInventory(String item) {
        inventory.add(item);
    }

    public void heal(int amount) {
        this.health += amount;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getExperience() {
        return experience;
    }

    public List<String> getInventory() {
        return inventory;
    }
}

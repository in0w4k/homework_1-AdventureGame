package enemies;

public class Zombie implements Enemy {

    String name;
    int damage;
    int experienceReward;

    public Zombie() {
        this.name = "Zombie";
        this.damage = 35;
        this.experienceReward = 30;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getDamage() {
        return damage;
    }

    @Override
    public int getExperienceReward() {
        return experienceReward;
    }
}


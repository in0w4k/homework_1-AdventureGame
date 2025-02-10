package enemies;

public class Creeper implements Enemy {

    String name;
    int damage;
    int experienceReward;

    public Creeper() {
        this.name = "Creeper";
        this.damage = 50;
        this.experienceReward = 80;
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


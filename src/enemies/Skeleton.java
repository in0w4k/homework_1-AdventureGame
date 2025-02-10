package enemies;

public class Skeleton implements Enemy {

    String name;
    int damage;
    int experienceReward;

    public Skeleton() {
        this.name = "Skeleton";
        this.damage = 10;
        this.experienceReward = 20;
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


package items;

import player.Player;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class ItemManager {

    private List<String> availableItems;

    public ItemManager() {
        this.availableItems = new ArrayList<>();
        availableItems.add("Gold Coin");
        availableItems.add("Health Elixir");
        availableItems.add("Magic Scroll");
    }

    public void pickUpItem(Player player) {
        Random random = new Random();
        int index = random.nextInt(availableItems.size());

        String item = availableItems.get(index);
        System.out.println(player.getName() + " picks up " + item);

        switch (item) {
            case "Gold Coin": player.gainExperience(5);
            case "Health Elixir": player.heal(20);
            case "Magic Scroll": player.gainExperience(15);
        }

        player.addItemToInventory(item);
    }
}

package dev.amethystmc.Hub.Interfaces;

import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.potion.PotionType;

/**
 * Created by Ben on 10/11/2016.
 */
public class ServerSelectorInterface extends InterfaceUtil
{

    @Override
    public String getName() {
        return "Server Selector";
    }

    @Override
    public void open(Player p) {

        Inventory inv = Bukkit.createInventory(p, 45, getName());

        inv.setItem(9, ItemUtil.createItem(Material.DIAMOND, "&aNetwork Boosters", "&7Click to view all the active", "&7boosters for the games across the network", " ", "&fNetwork Boosters: -"));
        inv.setItem(18, ItemUtil.createItem(Material.BREWING_STAND_ITEM, "&aNetwork Leveling", "&7Click to view your progress", "&7for your current level", " ", "&fCurrent Level: -"));
        inv.setItem(27, ItemUtil.createItem(Material.PAPER, "&aNetwork Sales", "&7Click to view all the current network sales", " ", "&fCurrent Sales: 1"));

        inv.setItem(17, ItemUtil.createItem(Material.NETHER_STAR, "&aSpawn", "&7Click to teleport back to Spawn"));
        inv.setItem(26, ItemUtil.createItem(Material.DIAMOND_CHESTPLATE, "&aWardrobe", "&7Click to teleport to Wardrobe"));
        inv.setItem(35, ItemUtil.createItem(Material.DIAMOND_SPADE, "&aSleef", "&7Click to teleport to Spleef"));

        inv.setItem(40, ItemUtil.createItem(Material.BOOK, "&dHow to Play", "&7Click to learn how to play", "&7on the Amethyst Network"));

        inv.setItem(11, ItemUtil.addGlow(ItemUtil.createItem(Material.DIAMOND_SWORD, "&4Arena PvP &8- &7(Arena)", "&b&lPOPULAR!", " ", "&dDescription:", "&eWelcome to Arena PvP! Here you",
                "&ecan pick kits to battle in 1v1, 2v2, and 3v3's with", "&e,and earn ELO!", " ", "&fPlayers: -/-")));
        inv.setItem(13, ItemUtil.addGlow(ItemUtil.createItem(Material.BLAZE_POWDER, "&cFactions &8- &7(PvP)", "&b&lPOPULAR!", " ", "&dDescription:", "&eWelcome to Factions! Here you can",
                "&eclaim land, destroy bases, and build bases", "&eto become the most powerful faction!", " ", "&fPlayers: -/-")));
        inv.setItem(15, ItemUtil.createItem(Material.GOLDEN_APPLE, (byte) 1, "&eUHC &8- &7(Hardcore)", "&b&lPOPULAR!", " ", "&dDescription:", "&eWelcome to our classic UHC! Here you",
                "&ewill be either solo or in a team and you will", "&ehave to fight the other players to win!", " ", "&fPlayers: -/-"));
        inv.setItem(21, ItemUtil.createItem(Material.IRON_HELMET, "&aKit PvP &8- &7(PvP)", " ", "&dDescription:", "&eWelcome to KitPvP! Here you can",
                "&ebattle against other players,", "&eearn killstreaks, perks, and achievements!", " ", "&fPlayers: -/-"));
        inv.setItem(23, ItemUtil.createItem(Material.BEACON, "&6UHC Duels &8- &7(Teams)", " ", "&dDescription:", "&eWelcome to UHC Duels! Here you start off on either",
                "&ered or blue team and you will", "&efight the other theam till only one", "&eteam stands declaring them the winner!", " ", "&fPlayers: -/-"));

        int[] slots = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 16, 19, 25, 28, 34, 36, 37, 38, 39, 41, 42, 43, 44};

        for (int i : slots)
        {

            inv.setItem(i, ItemUtil.addGlow(ItemUtil.createItem(Material.STAINED_GLASS_PANE, (byte) 2, " ")));

        }

        p.openInventory(inv);

    }

    @Override
    public void click(Player player, int i) {

    }
}


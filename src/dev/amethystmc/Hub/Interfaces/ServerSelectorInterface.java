package dev.amethystmc.Hub.Interfaces;

import dev.amethystmc.Core.Utils.InterfaceUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

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

        Inventory inv = Bukkit.createInventory(p, 36, getName());

        inv.setItem(11, ItemUtil.createItem(Material.IRON_HELMET, "&aKit PvP &8- &7(PvP)", " ", "&dDescription:", "&eWelcome to KitPvP! Here you can",
                "&ebattle against other players,", "&eearn killstreaks, perks, and achievements!", " ", "&fPlayers: -/-"));
        inv.setItem(13, ItemUtil.createItem(Material.DIAMOND_SWORD, "&cBattle Ground &8- &7(PvP)", " ", "&dDescription:", "&eWelcome to Battle Ground! Here you can",
                "&ebattle to the death,", "&edestroy the world, and place blocks and build a kingdom!", " ", "&fPlayers: -/-"));
        inv.setItem(15, ItemUtil.createItem(Material.GOLDEN_APPLE, "&6Kingdom Chaos &8- &7(PvP)", " ", "&dDescription:", "&eWelcome to Kingdom Chaos! Here you start off in a castle",
                "&eand the other team tries to destroy your castle", "&eand kill your king!", " ", "&fPlayers: -/-"));

        p.openInventory(inv);

    }

    @Override
    public void click(Player player, int i) {

    }
}


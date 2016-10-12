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

        inv.setItem(11, ItemUtil.createItem(Material.DIAMOND_SWORD, "&eKit PvP &8- &7(PvP)", " ", "&3Description:", "&aWelcome to KitPvP! Here you can",
                "&abattle against other players,", "&aearn killstreaks, perks, and achievements!", " ", "&fPlayers: 0/0"));

        p.openInventory(inv);

    }

    @Override
    public void click(Player player, int i) {

    }
}


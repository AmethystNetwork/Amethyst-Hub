package dev.amethystmc.Hub.Utils;

import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 10/11/2016.
 */
public class HubItems
{

    public static ItemStack getServerSelectorItem()
    {

        return ItemUtil.createItem(Material.COMPASS, "&dServer Selector &8- &7Right Click", "&7Click this to open up the Server Selector!");

    }

    public static ItemStack getProfileItem(Player p)
    {

        return ItemUtil.createSkull(p.getName(), "&dYour Profile &8- &7Right Click", "&7Click to view Your Profile!");

    }

    public static ItemStack getShopItem()
    {

        return ItemUtil.createItem(Material.DIAMOND, "&dShop &8- &7Right Click", "&7Click to open the Shop!");

    }

    public static ItemStack getCosmeticItems()
    {

        return ItemUtil.createItem(Material.ENDER_CHEST, "&dYour Cosmetics &8- &7Right Click", "&7Click to view Your Cosmetics!");

    }

    public static ItemStack getPlayersVisibileItem()
    {

        return ItemUtil.createItem(Material.ENDER_PEARL, "&dPlayers&f: &aVisible &8- &7Right Click", "&7Click to Hide Players!");

    }

    public static ItemStack getPlayersHiddenItem()
    {

        return ItemUtil.createItem(Material.ENDER_PEARL, "&dPlayers&f: &cHidden &8- &7Right Click", "&7Click to Show Players!");

    }

    public static ItemStack getLobbySelectorItem()
    {

        return ItemUtil.createItem(Material.HOPPER, "&dLobby Selector &8- &7Right Click", "&7Click to open up the Lobby Selector!");

    }

    public static void giveItemsToPlayer(Player p)
    {

        p.getInventory().setItem(0, getServerSelectorItem());
        p.getInventory().setItem(1, getProfileItem(p));
        p.getInventory().setItem(2, getShopItem());

        p.getInventory().setItem(4, getCosmeticItems());

        p.getInventory().setItem(7, getPlayersVisibileItem());
        p.getInventory().setItem(8, getLobbySelectorItem());

    }

}


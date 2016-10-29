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

        return ItemUtil.createItem(Material.COMPASS, "&aServer Selector", "&7Click this to open up the Server Selector!");

    }

    public static ItemStack getProfileItem(Player p)
    {

        return ItemUtil.createSkull(p.getName(), "&aProfile", "&7Click to view Your Profile!");

    }

    public static ItemStack getShopItem()
    {

        return ItemUtil.createItem(Material.DIAMOND, "&aShop", "&7Click to open the Shop!");

    }

    public static ItemStack getCosmeticItems()
    {

        return ItemUtil.createItem(Material.CHEST, "&aCosmetics", "&7Click to view Your Cosmetics!");

    }

    public static ItemStack getSettingsItem()
    {

        return ItemUtil.createItem(Material.REDSTONE_COMPARATOR, "&aSettings", "&7Click to open up the Settings Menu!");

    }

    public static ItemStack getLobbySelectorItem()
    {

        return ItemUtil.createItem(Material.HOPPER, "&aLobby Selector", "&7Click to open up the Lobby Selector!");

    }

    public static void giveItemsToPlayer(Player p)
    {

        p.getInventory().setItem(0, getServerSelectorItem());
        p.getInventory().setItem(1, getProfileItem(p));

        p.getInventory().setItem(4, getCosmeticItems());

        p.getInventory().setItem(7, getSettingsItem());
        p.getInventory().setItem(8, getLobbySelectorItem());

    }

}


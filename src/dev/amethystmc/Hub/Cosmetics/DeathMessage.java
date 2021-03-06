package dev.amethystmc.Hub.Cosmetics;

import dev.amethystmc.Core.Database.Players.Rank;
import dev.amethystmc.Core.Utils.ItemUtil;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Created by Ben on 9/27/2016.
 */
public enum DeathMessage
{

    YOU_GOT_ME_THIS_TIME("You got me this time", "&bYou got me this time!", ItemUtil.createItem(Material.ANVIL, "&bYou got me this time!"), Rank.PREMIUM, 11),
    YOLO("You Only Live Once", "&cYou Only Live Once!", ItemUtil.createItem(Material.ANVIL, "&cYou Only Live Once!"), Rank.PREMIUM, 12),
    I_JUST_GOT_REKT("I just got rekt", "&6I just got rekt!", ItemUtil.createItem(Material.ANVIL, "&6I just got rekt!"), Rank.PREMIUM, 13),
    YOU_CANT_KILL_A_BOSS("You can't kill a boss", "&9You can't kill a boss!", ItemUtil.createItem(Material.ANVIL, "&9You can't kill a boss"), Rank.PREMIUM, 14),
    WELP_I_DIED("Welp I died", "&aWelp I died", ItemUtil.createItem(Material.ANVIL, "&aWelp I died..."), Rank.PREMIUM, 15),
    ILL_GET_YOU_NEXT_TIME("I'll get you next time", "&2I'll get you next time!", ItemUtil.createItem(Material.ANVIL, "&2I'll get you next time!"), Rank.PREMIUM, 20),
    RIP("RIP", "&bRIP", ItemUtil.createItem(Material.ANVIL, "&bRIP"), Rank.PREMIUM, 21),
    REMOVE("Remove", " ", ItemUtil.createItem(Material.BARRIER, "&cRemove your Death Message"), Rank.MEMBER, 22),
    NONE("None", "", ItemUtil.createItem(Material.AIR), Rank.MEMBER, 0);

    String name;
    String deathMessage;
    ItemStack stack;
    Rank requiredRank;
    int slot;

    DeathMessage(String name, String deathMessage, ItemStack stack, Rank requiredRank, int slot)
    {

        this.name = name;
        this.deathMessage = deathMessage;
        this.stack = stack;
        this.requiredRank = requiredRank;
        this.slot = slot;

    }

    public String getName()
    {

        return name;

    }

    public String getDeathMessage()
    {

        return deathMessage;

    }

    public ItemStack getStack()
    {

        return stack;

    }

    public Rank getRequiredRank()
    {

        return requiredRank;

    }

    public int getSlot()
    {

        return slot;

    }

    private static Map<UUID, DeathMessage> players = new HashMap<>();

    public static void addDeathMessage(Player p, DeathMessage dm)
    {

        players.put(p.getUniqueId(), dm);

    }

    public static void removeDeathMessage(Player p)
    {

        players.remove(p.getUniqueId());

    }

    public static DeathMessage getDeathMessage(Player p)
    {

        return players.get(p.getUniqueId());

    }

    public static boolean hasDeathMessage(Player p)
    {

        return players.containsKey(p.getUniqueId());

    }

}


package dev.amethystmc.Hub.NPC;

import dev.amethystmc.Core.NPC.NPC;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Villager;

/**
 * Created by Ben on 10/11/2016.
 */
public class NPCLocations
{

    public static Location COSMETIC_SHOP = new Location(Bukkit.getWorlds().get(0), 23.473, 16.00000, 669.471, 140, 0);


    public static void spawnShops()
    {

        NPC.getVillagerNPC().spawnVillagerNPC(COSMETIC_SHOP, "&7&oCosmetics", "&d&lRight Click", "&e&l▼ Cosmetic Shop ▼", Villager.Profession.LIBRARIAN, true);

    }
}


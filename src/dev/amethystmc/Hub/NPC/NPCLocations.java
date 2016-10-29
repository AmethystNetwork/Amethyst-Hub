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
    public static Location FACTIONS = new Location(Bukkit.getWorlds().get(0), 26.479, 13.00000, 683.514, 140, 0);
    public static Location ARENA = new Location(Bukkit.getWorlds().get(0), 21.490, 13.00000, 683.451, 180, 0);
    public static Location UHCDUELS = new Location(Bukkit.getWorlds().get(0), 16.613, 13.00000, 683.437, 210, 0);


    public static void spawnShops()
    {

        NPC.getVillagerNPC().spawnVillagerNPC(COSMETIC_SHOP, "&7&oCosmetics", "&f&lRight Click", "&e&l▼ Cosmetic Shop ▼", Villager.Profession.LIBRARIAN, true);
        NPC.getVillagerNPC().spawnVillagerNPC(FACTIONS, "&7&oFactions", "&f&lRight Click", "&c&lFactions &f(PvP)", Villager.Profession.LIBRARIAN, true);
        NPC.getVillagerNPC().spawnVillagerNPC(ARENA, "&7&oArena", "&f&lRight Click", "&4&lArena &f(Arena)", Villager.Profession.LIBRARIAN, true);
        NPC.getVillagerNPC().spawnVillagerNPC(UHCDUELS, "&7&oUHC Duels", "&f&lRight Click", "&6&lUHC Duels &f(Teams)", Villager.Profession.LIBRARIAN, true);

    }
}


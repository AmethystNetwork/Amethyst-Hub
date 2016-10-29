package dev.amethystmc.Hub.NPC;

import dev.amethystmc.Core.NPC.NPC;
import org.bukkit.Bukkit;
import org.bukkit.Location;

/**
 * Created by Ben on 10/18/2016.
 */
public class HologramLocations
{

    public static Location INFO = new Location(Bukkit.getWorlds().get(0), 21.477, 15.00000, 673.531, 0, 0);


    public static void spawnHolograms()
    {

        NPC.getHologramNPC().spawnHologram(INFO, "&6&lSALE: &b&l50% Off Everything", "&a&oamethystmc.com &fand &ashop.amethystmc.com", "&bBe sure to check out our forums and shop at", "&eWelcome to &d&lAmethystMC");

    }

}


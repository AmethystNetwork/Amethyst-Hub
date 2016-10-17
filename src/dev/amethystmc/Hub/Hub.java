package dev.amethystmc.Hub;

import dev.amethystmc.Hub.Commands.HubDebugCommand;
import dev.amethystmc.Hub.Listeners.InventoryClickListener;
import dev.amethystmc.Hub.Listeners.PlayerInteractEntityListener;
import dev.amethystmc.Hub.Listeners.PlayerInteractListener;
import dev.amethystmc.Hub.Listeners.PlayerJoinListener;
import dev.amethystmc.Hub.NPC.NPCLocations;
import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created by Ben on 10/10/2016.
 */
public class Hub extends JavaPlugin
{

    private static Hub instance;

    public void onEnable()
    {

        instance = this;
        registerListeners();
        registerCommands();
        NPCLocations.spawnShops();

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);
        pm.registerEvents(new PlayerInteractEntityListener(), this);
        pm.registerEvents(new InventoryClickListener(), this);
        pm.registerEvents(new PlayerInteractListener(), this);

    }

    public void registerCommands()
    {

        HubDebugCommand hubDebugCommand = new HubDebugCommand("HubDebug", "hubDebug", "Hub Debug Command");
        hubDebugCommand.register();

    }

    public static Hub getInstance()
    {

        return instance;

    }

}


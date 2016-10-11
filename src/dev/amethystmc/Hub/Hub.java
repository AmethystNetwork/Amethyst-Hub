package dev.amethystmc.Hub;

import dev.amethystmc.Hub.Listeners.PlayerJoinListener;
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

    }

    public void registerListeners()
    {

        PluginManager pm = Bukkit.getPluginManager();
        pm.registerEvents(new PlayerJoinListener(), this);

    }

    public void registerCommands()
    {



    }

    public static Hub getInstance()
    {

        return instance;

    }

}


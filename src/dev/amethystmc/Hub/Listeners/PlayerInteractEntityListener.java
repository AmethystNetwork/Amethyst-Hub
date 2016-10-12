package dev.amethystmc.Hub.Listeners;

import dev.amethystmc.Core.Utils.MessageUtil;
import dev.amethystmc.Hub.Interfaces.Interfaces;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Villager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

/**
 * Created by Ben on 10/11/2016.
 */
public class PlayerInteractEntityListener implements Listener
{

    @EventHandler
    public void onPlayerInteractEntityEvent(PlayerInteractEntityEvent e)
    {

        Player p = e.getPlayer();
        Entity entity = e.getRightClicked();

        if (!(entity instanceof Villager))
            return;

        Villager v = (Villager) entity;

        if (v.getCustomName().equalsIgnoreCase(MessageUtil.colorize("&7&oCosmetics")))
        {

            e.setCancelled(true);
            Interfaces.getCosmeticInterface().open(p);

        }

    }

}


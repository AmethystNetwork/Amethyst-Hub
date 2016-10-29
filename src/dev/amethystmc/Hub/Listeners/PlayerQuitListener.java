package dev.amethystmc.Hub.Listeners;

import dev.amethystmc.Hub.NPC.HologramLocations;
import dev.amethystmc.Hub.Players.HubPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * Created by Ben on 10/18/2016.
 */
public class PlayerQuitListener implements Listener
{

    @EventHandler
    public void onPlayerQuitEvent(PlayerQuitEvent e)
    {

        Player p = e.getPlayer();

        e.setQuitMessage("");
        HubPlayer.removePlayerFromHub(p);
    }

}


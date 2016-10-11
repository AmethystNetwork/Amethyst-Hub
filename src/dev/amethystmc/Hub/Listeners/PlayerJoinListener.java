package dev.amethystmc.Hub.Listeners;

import dev.amethystmc.Core.Utils.MessageUtil;
import dev.amethystmc.Hub.Utils.HubItems;
import dev.amethystmc.Hub.Utils.HubScoreboard;
import org.bukkit.Sound;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/**
 * Created by Ben on 10/10/2016.
 */
public class PlayerJoinListener implements Listener
{

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e)
    {

        e.setJoinMessage("");

        Player p = e.getPlayer();

        HubScoreboard.setupScoreboard(p);
        MessageUtil.sendRawMessage(p, "&eWelcome to &dAmethystMC");
        MessageUtil.sendRawMessage(p, "&eConsider buying &bPremium &eat");
        MessageUtil.sendRawMessage(p, "&7&oshop.amethystmc.com");
        p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);

        HubItems.giveItemsToPlayer(p);
    }

}


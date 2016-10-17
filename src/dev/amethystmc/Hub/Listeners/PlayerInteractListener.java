package dev.amethystmc.Hub.Listeners;

import dev.amethystmc.Hub.Interfaces.Interfaces;
import dev.amethystmc.Hub.Utils.HubItems;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

/**
 * Created by Ben on 10/15/2016.
 */
public class PlayerInteractListener implements Listener
{

    @EventHandler
    public void onPlayerInteractEvent(PlayerInteractEvent e)
    {

        Player p = e.getPlayer();
        Action action = e.getAction();
        ItemStack i = p.getItemInHand();

        if (action != Action.LEFT_CLICK_AIR && action != Action.LEFT_CLICK_BLOCK)
        {

            if (i.equals(HubItems.getServerSelectorItem()))
            {

                e.setCancelled(true);
                Interfaces.getServerSelectorInterface().open(p);

            }

            else if (i.equals(HubItems.getCosmeticItems()))
            {

                e.setCancelled(true);
                Interfaces.getCosmeticInterface().open(p);

            }

        }

    }

}


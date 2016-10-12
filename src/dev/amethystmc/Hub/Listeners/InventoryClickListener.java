package dev.amethystmc.Hub.Listeners;

import dev.amethystmc.Hub.Interfaces.Interfaces;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * Created by Ben on 10/11/2016.
 */
public class InventoryClickListener implements Listener
{

    @EventHandler
    public void onInventoryClickEvent(InventoryClickEvent e)
    {

        Player p = (Player) e.getWhoClicked();
        int slot = e.getRawSlot();
        String name = e.getInventory().getName();

        if (name.equalsIgnoreCase(Interfaces.getCosmeticInterface().getName()))
        {

            Interfaces.getCosmeticInterface().click(p, slot);
            e.setCancelled(true);

        }

        else if (name.equalsIgnoreCase(Interfaces.getHatInterface().getName()))
        {

            Interfaces.getHatInterface().click(p, slot);
            e.setCancelled(true);

        }

        else if (name.equalsIgnoreCase(Interfaces.getGadgetInterface().getName()))
        {

            Interfaces.getGadgetInterface().click(p, slot);
            e.setCancelled(true);

        }

        else if (name.equalsIgnoreCase(Interfaces.getTrailInterface().getName()))
        {

            Interfaces.getTrailInterface().click(p, slot);
            e.setCancelled(true);

        }

        else if (name.equalsIgnoreCase(Interfaces.getDeathMessageInterface().getName()))
        {

            Interfaces.getDeathMessageInterface().click(p, slot);
            e.setCancelled(true);

        }

        else if (name.equalsIgnoreCase(Interfaces.getTagInterface().getName()))
        {

            Interfaces.getTagInterface().click(p, slot);
            e.setCancelled(true);

        }

    }

}


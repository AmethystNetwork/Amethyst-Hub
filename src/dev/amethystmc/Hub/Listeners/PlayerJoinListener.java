package dev.amethystmc.Hub.Listeners;

import dev.amethystmc.Core.NPC.HologramNPC;
import dev.amethystmc.Core.Utils.MessageUtil;
import dev.amethystmc.Hub.NPC.HologramLocations;
import dev.amethystmc.Hub.Players.HubPlayer;
import dev.amethystmc.Hub.Utils.HubItems;
import dev.amethystmc.Hub.Utils.HubScoreboard;
import net.minecraft.server.v1_8_R3.BlockPosition;
import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.PacketPlayOutUpdateSign;
import org.bukkit.Bukkit;
import org.bukkit.Sound;
import org.bukkit.craftbukkit.v1_8_R3.CraftWorld;
import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

/**
 * Created by Ben on 10/10/2016.
 */
public class PlayerJoinListener implements Listener
{

    @EventHandler
    public void onPlayerJoinEvent(PlayerJoinEvent e)
    {

        Player p = e.getPlayer();

        e.setJoinMessage("");
        HubPlayer.addPlayerToHub(p);

        HubScoreboard.setupScoreboard(p);
        MessageUtil.sendRawMessage(p, "&eWelcome to &dAmethystMC");
        MessageUtil.sendRawMessage(p, "&eConsider buying &bPremium &eat");
        MessageUtil.sendRawMessage(p, "&7&oshop.amethystmc.com");
        p.playSound(p.getLocation(), Sound.LEVEL_UP, 10, 10);

        HubItems.giveItemsToPlayer(p);

        p.teleport(Bukkit.getWorld("world").getSpawnLocation());

        p.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 100000000, 1));
        p.addPotionEffect(new PotionEffect(PotionEffectType.JUMP, 100000000, 1));
    }

}


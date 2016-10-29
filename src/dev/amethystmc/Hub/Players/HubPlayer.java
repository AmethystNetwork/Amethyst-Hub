package dev.amethystmc.Hub.Players;

import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 10/18/2016.
 */
public class HubPlayer
{

    private Player p;

    private static List<Player> hubPlayer = new ArrayList<>();

    public HubPlayer(Player p)
    {

        this.p = p;

    }

    public static void addPlayerToHub(Player p)
    {

        hubPlayer.add(p);

    }

    public static void removePlayerFromHub(Player p)
    {

        hubPlayer.remove(p);

    }

    public static List<Player> getHubPlayers()
    {

        return hubPlayer;

    }

}


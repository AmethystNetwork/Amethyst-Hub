package dev.amethystmc.Hub.Utils;

import dev.amethystmc.Core.Utils.MessageUtil;
import dev.amethystmc.Core.Utils.ScoreboardUtil;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 10/10/2016.
 */
public class HubScoreboard
{

    public static void setupScoreboard(Player p)
    {

        ScoreboardUtil board = new ScoreboardUtil(MessageUtil.colorize("&d&lAmethystMC"));

        board.add(MessageUtil.colorize("&eRank:"));
        board.add(MessageUtil.colorize("&cN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&eTokens:"));
        board.add(MessageUtil.colorize("&cN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&eTag:"));
        board.add(MessageUtil.colorize("&cN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&eServer:"));
        board.add(MessageUtil.colorize("&cN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&fAmethystMC.com"));

        board.build();
        board.send(p);

    }

}


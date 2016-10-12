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

        board.blankLine();
        board.add(MessageUtil.colorize("&5Rank:"));
        board.add(MessageUtil.colorize("&fN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&5Tokens:"));
        board.add(MessageUtil.colorize("&fN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&5Tag:"));
        board.add(MessageUtil.colorize("&fN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&5Server:"));
        board.add(MessageUtil.colorize("&fN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&ewww.AmethystMC.com"));

        board.build();
        board.send(p);

    }

}


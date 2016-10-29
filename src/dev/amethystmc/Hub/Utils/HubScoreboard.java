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
        board.add(MessageUtil.colorize("&e&lRank:"));
        board.add(MessageUtil.colorize("&bN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&e&lTokens:"));
        board.add(MessageUtil.colorize("&bN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&e&lTag:"));
        board.add(MessageUtil.colorize("&bN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&e&lServer:"));
        board.add(MessageUtil.colorize("&bN/A"));
        board.blankLine();
        board.add(MessageUtil.colorize("&f&lwww.AmethystMC.com"));

        board.build();
        board.send(p);

    }

}


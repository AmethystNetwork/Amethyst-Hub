package dev.amethystmc.Hub.Commands;

import dev.amethystmc.Core.Utils.CommandUtil;
import dev.amethystmc.Core.Utils.ItemUtil;
import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 10/19/2016.
 */
public class HeadCommand extends CommandUtil
{

    public HeadCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("head"))
        {

            Player p = (Player) sender;

            if (args.length < 1)
            {

                MessageUtil.sendRawMessage(p, "&c/head <player>");
                return true;

            }

            else {
                p.getInventory().addItem(ItemUtil.createSkull(args[0].toString(), "&a" + args[0].toString() + "'s Head"));
            }

        }

        return true;

    }

}


package dev.amethystmc.Hub.Commands;

import dev.amethystmc.Core.Utils.CommandUtil;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * Created by Ben on 10/11/2016.
 */
public class HubDebugCommand extends CommandUtil
{

    public HubDebugCommand(String command, String usage, String description)
    {
        super(command, usage, description);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args)
    {

        if (cmd.getName().equalsIgnoreCase("hubDebug"))
        {

            Player p = (Player) sender;
            dev.amethystmc.Hub.Interfaces.Interfaces.getServerSelectorInterface().open(p);

        }

        return true;

    }

}


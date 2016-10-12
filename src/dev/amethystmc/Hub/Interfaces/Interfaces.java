package dev.amethystmc.Hub.Interfaces;

/**
 * Created by Ben on 10/11/2016.
 */
public class Interfaces
{

    private static ServerSelectorInterface serverSelectorInterface = new ServerSelectorInterface();

    public static ServerSelectorInterface getServerSelectorInterface()
    {

        return serverSelectorInterface;

    }

}


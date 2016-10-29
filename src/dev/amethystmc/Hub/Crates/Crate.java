package dev.amethystmc.Hub.Crates;

import org.bukkit.Location;

/**
 * Created by Ben on 10/26/2016.
 */
public class Crate
{

    private Location location;
    private String data;

    public Crate(Location location, String data)
    {

        this.location = location;
        this.data = data;

    }

    public Location getLocation()
    {

        return location;

    }

    public String getData()
    {

        return data;

    }

}


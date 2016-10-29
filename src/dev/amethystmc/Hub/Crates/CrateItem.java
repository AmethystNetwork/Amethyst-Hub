package dev.amethystmc.Hub.Crates;

import dev.amethystmc.Core.Utils.MessageUtil;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ben on 10/26/2016.
 */
public class CrateItem
{
    private String name;
    private List<String> lore;
    private int material;
    private int data;
    private List<String> commands;
    private CrateRarity rarity;

    public CrateItem(String name, List<String> lore, int material, int data, List<String> commands, CrateRarity rarity)
    {
        this.name = name;
        this.lore = lore;
        this.material = material;
        this.data = data;
        this.commands = commands;
        this.rarity = rarity;
    }

    public String getName()
    {
        return this.name;
    }

    public List<String> getLore()
    {
        return this.lore;
    }

    public int getMaterial()
    {
        return this.material;
    }

    public int getData()
    {
        return this.data;
    }

    public List<String> getCommands()
    {
        return this.commands;
    }

    public CrateRarity getRarity()
    {
        return this.rarity;
    }

    public ItemStack toItemStack()
    {
        ItemStack i = new ItemStack(this.material, 1, (short) this.data);
        ItemMeta im = i.getItemMeta();
        im.setDisplayName(this.name);
        List<String> imlore = new ArrayList();
        imlore.add(MessageUtil.colorize("&7Rarity: " + this.rarity.getColor() + this.rarity.getName()));
        for (String s : this.lore) {
            imlore.add(s);
        }
        im.setLore(imlore);
        i.setItemMeta(im);
        return i;
    }
}



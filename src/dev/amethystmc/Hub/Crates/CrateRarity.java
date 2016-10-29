package dev.amethystmc.Hub.Crates;

/**
 * Created by Ben on 10/26/2016.
 */
public enum CrateRarity
{
    COMMON(90, "&b&l", "Common"),
    RARE(8, "&5&l", "Rare"),
    EPIC(2, "&4&l", "Epic");

    private int percentageChance;
    private String color;
    private String name;

    private CrateRarity(int percentageChance, String color, String name)
    {
        this.percentageChance = percentageChance;
        this.color = color;
        this.name = name;
    }

    public int getPercentageChance()
    {
        return this.percentageChance;
    }

    public void setPercentageChance(int percentageChance)
    {
        this.percentageChance = percentageChance;
    }

    public String getColor()
    {
        return this.color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public String getName()
    {
        return this.name;
    }
}



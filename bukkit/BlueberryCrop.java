package net.minecraft.server;

public class BlueberryCrop extends BasicBerryCrop
{
    public static final int spriteIndex = 64;

    public BlueberryCrop(int var1, ItemStack var2)
    {
        super(var1, var2, 64);
    }

    public String name()
    {
        return "Blueberry";
    }

    public String[] attributes()
    {
        return new String[] {"Berry", "Food", "Tendrilly", "Blue"};
    }

    public String discoveredBy()
    {
        return "Ancient cultures";
    }
}

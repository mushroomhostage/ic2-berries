package net.minecraft.server;

public class RaspberryCrop extends BasicBerryCrop
{
    public static final int spriteIndex = 32;

    public RaspberryCrop(int var1, ItemStack var2)
    {
        super(var1, var2, 32);
    }

    public String name()
    {
        return "Raspberry";
    }

    public String[] attributes()
    {
        return new String[] {"Berry", "Food", "Tendrilly", "Red"};
    }

    public String discoveredBy()
    {
        return "Ancient cultures";
    }
}

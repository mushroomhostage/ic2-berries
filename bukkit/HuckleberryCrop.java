package net.minecraft.server;

public class HuckleberryCrop extends BasicBerryCrop
{
    public static final int spriteIndex = 80;

    public HuckleberryCrop(int var1, ItemStack var2)
    {
        super(var1, var2, 80);
    }

    public String name()
    {
        return "Huckleberry";
    }

    public String[] attributes()
    {
        return new String[] {"Berry", "Food", "Tendrilly", "Purple", "Leaves"};
    }

    public String discoveredBy()
    {
        return "Ancient cultures";
    }
}

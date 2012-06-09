package net.minecraft.server;

public class StrawberryCrop extends BasicBerryCrop
{
    public static final int spriteIndex = 48;

    public StrawberryCrop(int var1, ItemStack var2)
    {
        super(var1, var2, 48);
    }

    public String name()
    {
        return "Strawberry";
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

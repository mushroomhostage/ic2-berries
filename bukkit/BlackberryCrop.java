package net.minecraft.server;

public class BlackberryCrop extends BasicBerryCrop
{
    public static final int spriteIndex = 16;

    public BlackberryCrop(int var1, ItemStack var2)
    {
        super(var1, var2, 16);
    }

    public String name()
    {
        return "Blackberry";
    }

    public String[] attributes()
    {
        return new String[] {"Berry", "Food", "Tendrilly", "Black", "Purple"};
    }

    public String discoveredBy()
    {
        return "Ancient cultures";
    }
}

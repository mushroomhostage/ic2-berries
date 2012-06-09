package net.minecraft.server;

import ic2.api.CropCard;
import ic2.api.TECrop;

public class VineCrop extends CropCard
{
    public VineCrop(int var1)
    {
        CropCard.registerBaseSeed(new ItemStack(Block.VINE.id, 1, 0), var1, 1, 10, 10, 10);
        CropCard.registerCrop(this, var1);
    }

    public String name()
    {
        return "Vines";
    }

    public String discoveredBy()
    {
        return "jeb_";
    }

    public int tier()
    {
        return 1;
    }

    public int stat(int var1)
    {
        switch (var1)
        {
            case 0:
                return 0;

            case 1:
                return 0;

            case 2:
                return 0;

            case 3:
                return 2;

            case 4:
                return 0;

            default:
                return 0;
        }
    }

    public String[] attributes()
    {
        return new String[] {"Green", "Tendrilly", "Climbable"};
    }

    public int getSpriteIndex(TECrop var1)
    {
        return var1.size - 1;
    }

    public String getTextureFile()
    {
        return "/berries_crops.png";
    }

    public boolean canGrow(TECrop var1)
    {
        return var1.size < 3;
    }

    public boolean canBeHarvested(TECrop var1)
    {
        return var1.size == 3;
    }

    public int weightInfluences(TECrop var1, float var2, float var3, float var4)
    {
        return (int)((double)var2 * 1.1D + (double)var3 * 0.9D + (double)var4);
    }

    public int growthDuration(TECrop var1)
    {
        return 40;
    }

    public ItemStack getGain(TECrop var1)
    {
        return new ItemStack(Block.VINE, 2);
    }

    public byte getSizeAfterHarvest(TECrop var1)
    {
        return (byte)2;
    }
}

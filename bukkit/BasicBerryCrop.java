package net.minecraft.server;

import ic2.api.CropCard;
import ic2.api.TECrop;
import java.util.Random;

public abstract class BasicBerryCrop extends CropCard
{
    public ItemStack seed;
    public int spriteIndex;
    public Random random;

    public BasicBerryCrop(int var1, ItemStack var2, int var3)
    {
        CropCard.registerBaseSeed(var2, var1, 1, 10, 10, 10);
        this.seed = var2;
        this.spriteIndex = var3;
        this.random = new Random();
        CropCard.registerCrop(this, var1);
    }

    public int tier()
    {
        return 2;
    }

    public int stat(int var1)
    {
        switch (var1)
        {
            case 0:
                return 0;

            case 1:
                return 4;

            case 2:
                return 0;

            case 3:
                return 4;

            case 4:
                return 0;

            default:
                return 0;
        }
    }

    public int getSpriteIndex(TECrop var1)
    {
        return var1.size - 1 + this.spriteIndex;
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
        return (int)((double)var2 * 1.2D + (double)var3 * 0.9D + (double)var4 * 0.9D);
    }

    public int growthDuration(TECrop var1)
    {
        return var1.size == 2 ? 200 : 700;
    }

    public ItemStack getGain(TECrop var1)
    {
        ItemStack var2 = new ItemStack(this.seed.id, 5 + this.random.nextInt(5), this.seed.getData());
        return var2;
    }

    public byte getSizeAfterHarvest(TECrop var1)
    {
        return (byte)2;
    }

    public boolean onEntityCollision(TECrop var1, Entity var2)
    {
        return false;
    }
}


import net.minecraft.src.ic2.api.CropCard;
import net.minecraft.src.ic2.api.TECrop;
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public abstract class BasicBerryCrop extends CropCard {
    public int seed;
    public int spriteIndex;

    public BasicBerryCrop(int id, int seed, int spriteIndex) {
        this.seed = seed;
        this.spriteIndex = spriteIndex;

        CropCard.registerBaseSeed(new ItemStack(seed, 1, 0), id, 1, 10, 10, 10);
    }

    @Override
    public int tier() {
        return 2;
    }

    @Override
    public int stat(int n) {
        switch(n) {
        case 0: return 0;   // not chemical
        case 1: return 1;   // edible
        case 2: return 0;   // no defensive properties
        case 3: return 2;   // primarily decorative (TODO)
        case 4: return 0;   // not particularly weed-like
        default: return 0;
        }
    }

    @Override
    public String[] attributes() {
        return new String[] {"Edible", "Berry", "Primitive"};
    }

    @Override
    public int getSpriteIndex(TECrop crop) {
        return crop.size - 1 + spriteIndex;
    }

    @Override
    public String getTextureFile() {
        return "/berries_crops.png";
    }

    @Override
    public boolean canGrow(TECrop crop) {
        // Grows in three stages:
        // 1 - initially planted
        // 2 - partially grown
        // 3 - fully grown and harvestable
        return crop.size < 3;
    }

    @Override
    public boolean canBeHarvested(TECrop crop) {
        return crop.size == 3;
    }

    @Override
    public int weightInfluences(TECrop crop, float humidity, float nutrients, float air) {
        // TODO: require more humidity, not as much nutrients or air
        return (int)(humidity*1.1 + nutrients*0.9 + air);
    }

    @Override
    public int growthDuration(TECrop crop) {
        //return 225;     // as fast as pumpkin stems
        return 40;
    }

    @Override
    public ItemStack getGain(TECrop crop) {
        return new ItemStack(seed, 5, 1);   // TODO: + random
    }

    @Override
    public byte getSizeAfterHarvest(TECrop crop) {
        // return to partially grown state when harvested
        return 2;
    }
}


import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class RaspberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 2;

    public RaspberryCrop(int id, ItemStack item) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Raspberry";
    }

    public String[] attributes() {
        return new String[] {"Berry", "Food", "Tendrilly", "Red"}; // Red like CropRedWheat, CropNetherWart
    }


    public String discoveredBy() {
        return "Ancient cultures";
    }
}


import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class StrawberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 3;

    public StrawberryCrop(int id, ItemStack item) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Strawberry";
    }

    public String[] attributes() {
        return new String[] {"Berry", "Food", "Tendrilly", "Red"}; // Red like CropRedWheat, CropNetherWart
    }


    public String discoveredBy() {
        return "Ancient cultures";
    }
}

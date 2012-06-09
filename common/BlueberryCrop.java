
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BlueberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 4;

    public BlueberryCrop(int id, ItemStack item) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Blueberry";
    }

    public String[] attributes() {
        return new String[] {"Berry", "Food", "Tendrilly", "Blue"}; // Blue like CropTerraWart
    }


    public String discoveredBy() {
        return "Ancient cultures";
    }
}

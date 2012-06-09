
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class HuckleberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 5;

    public HuckleberryCrop(int id, ItemStack item) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Huckleberry";
    }

    public String[] attributes() {
        return new String[] {"Berry", "Food", "Tendrilly", "Purple", "Leaves"}; // Purple like CropVenomilia, Leaves like CropFerru
    }


    public String discoveredBy() {
        return "Ancient cultures";
    }
}

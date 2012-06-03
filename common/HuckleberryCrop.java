
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class HuckleberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 5;
    final static public ItemStack item = new ItemStack(20000, 1, 6);

    public HuckleberryCrop(int id) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Huckleberry";
    }

    public String discoveredBy() {
        return "Ancient cultures";
    }
}

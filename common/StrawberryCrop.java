
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class StrawberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 3;
    final static public ItemStack item = new ItemStack(20000, 1, 8);        // TODO: new item

    public StrawberryCrop(int id) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Strawberry";
    }

    public String discoveredBy() {
        return "Ancient cultures";
    }
}

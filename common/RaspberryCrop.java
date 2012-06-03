
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class RaspberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16 * 2;
    final static public ItemStack item = new ItemStack(20000, 1, 8);

    public RaspberryCrop(int id) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Raspberry";
    }

    public String discoveredBy() {
        return "Ancient cultures";
    }
}

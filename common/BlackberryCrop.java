
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BlackberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16;
    final static public ItemStack item = new ItemStack(20000, 1, 5);

    public BlackberryCrop(int id) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Blackberry";
    }

    public String discoveredBy() {
        return "Ancient cultures";
    }
}

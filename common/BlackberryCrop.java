
import net.minecraft.src.*;
import net.minecraft.src.forge.*;

public class BlackberryCrop extends BasicBerryCrop {
    final static public int spriteIndex = 16;

    public BlackberryCrop(int id, ItemStack item) {
        super(id, item, spriteIndex);
    }

    public String name() {
        return "Blackberry";
    }

    public String discoveredBy() {
        return "Ancient cultures";
    }
}

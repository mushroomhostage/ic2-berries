
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.ic2.api.CropCard;
import java.io.*;

public class BerriesConfig {
    public int cropid_vine;
    public int cropid_blackberry;
    public int cropid_raspberry;
    public int cropid_strawberry;
    public int cropid_blueberry;
    public int cropid_huckleberry;

    public BerriesConfig(Configuration config) {
        try {
            config.load();
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        cropid_vine = Integer.parseInt(config.getOrCreateIntProperty("cropid.vine", Configuration.CATEGORY_GENERAL, 60).value);
        cropid_blackberry = Integer.parseInt(config.getOrCreateIntProperty("cropid.blackberry", Configuration.CATEGORY_GENERAL, 61).value);
        cropid_raspberry = Integer.parseInt(config.getOrCreateIntProperty("cropid.raspberry", Configuration.CATEGORY_GENERAL, 62).value);
        cropid_strawberry = Integer.parseInt(config.getOrCreateIntProperty("cropid.strawberry", Configuration.CATEGORY_GENERAL, 63).value);
        cropid_blueberry = Integer.parseInt(config.getOrCreateIntProperty("cropid.blueberry", Configuration.CATEGORY_GENERAL, 64).value);
        cropid_huckleberry = Integer.parseInt(config.getOrCreateIntProperty("cropid.huckleberry", Configuration.CATEGORY_GENERAL, 65).value);
    }

    public void registerCrops() {
        if (cropid_vine != 0) new VineCrop(cropid_vine);
        if (cropid_blackberry != 0) new BlackberryCrop(cropid_blackberry);
        if (cropid_raspberry != 0) new RaspberryCrop(cropid_raspberry);
        if (cropid_strawberry != 0) new StrawberryCrop(cropid_strawberry);
        if (cropid_blueberry != 0) new BlueberryCrop(cropid_blueberry);
        if (cropid_huckleberry != 0) new HuckleberryCrop(cropid_huckleberry);
    }
}



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
        }

        // TODO: load
        cropid_vine = 60;
        cropid_blackberry = 61;
        cropid_raspberry = 62;
        cropid_strawberry = 63;
        cropid_blueberry = 64;
        cropid_huckleberry = 65;
    }

    public void registerCrops() {
        CropCard.registerCrop(new VineCrop(cropid_vine), cropid_vine);
        CropCard.registerCrop(new BlackberryCrop(cropid_blackberry), cropid_blackberry);
        CropCard.registerCrop(new RaspberryCrop(cropid_raspberry), cropid_raspberry);
        CropCard.registerCrop(new StrawberryCrop(cropid_strawberry), cropid_strawberry);
        CropCard.registerCrop(new BlueberryCrop(cropid_blueberry), cropid_blueberry);
        CropCard.registerCrop(new HuckleberryCrop(cropid_huckleberry), cropid_huckleberry);
    }
}



import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.ic2.api.CropCard;
import java.io.*;

public class BerriesConfig {
    public int cropid_vine;

    public BerriesConfig(Configuration config) {
        try {
            config.load();
        } catch (RuntimeException e) {
        }

        // TODO: load
        cropid_vine = 60;
    }

    public void registerCrops() {
        CropCard.registerCrop(new VineCrop(cropid_vine), cropid_vine);
    }
}


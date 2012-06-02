
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import net.minecraft.src.ic2.api.CropCard;
import java.io.*;

public class mod_Berries extends NetworkMod {
    public final int cropid_vine;

    public mod_Berries() {
        Configuration config = new Configuration(new File("./config/Berries++.cfg"));

        try {
            config.load();
        } catch (RuntimeException e) {
        }

        cropid_vine = 60;
    }

    public void load() {
        CropCard.registerCrop(new VineCrop(cropid_vine), cropid_vine);
    }

    public String getVersion() {
        return "0";
    }

    public String getPriorities() {
        return "required-after:mod_IC2";
    }

    public boolean clientSideRequired() {
        return true;
    }

    public boolean serverSideRequired() {
        return false;
    }
}


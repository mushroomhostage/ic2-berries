
import net.minecraft.src.*;
import net.minecraft.src.forge.*;
import net.minecraft.client.Minecraft;
import net.minecraft.src.ic2.api.CropCard;
import java.io.*;

public class mod_Berries extends NetworkMod {
    BerriesConfig config;

    public mod_Berries() {
        config = new BerriesConfig(new Configuration(new File(Minecraft.getMinecraftDir(), "config/Berries++.cfg")));
    }

    public void load() {
        config.registerCrops();

        MinecraftForgeClient.preloadTexture("/berries_crops.png");
    }

    public String getVersion() {
        return "1.0";
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


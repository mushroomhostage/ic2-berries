package net.minecraft.server;

import forge.Configuration;
import forge.NetworkMod;
import java.io.File;

public class mod_Berries extends NetworkMod
{
    BerriesConfig config = new BerriesConfig(new Configuration(new File("./config/Berries++.cfg")));

    public void load()
    {
        this.config.registerCrops();
    }

    public String getVersion()
    {
        return "1.0";
    }

    public String getPriorities()
    {
        return "required-after:mod_IC2";
    }

    public boolean clientSideRequired()
    {
        return true;
    }

    public boolean serverSideRequired()
    {
        return false;
    }
}

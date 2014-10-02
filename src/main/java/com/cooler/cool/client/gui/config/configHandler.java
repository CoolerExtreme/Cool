package com.cooler.cool.client.gui.config;

import static com.cooler.cool.reference.reference.*;

import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

/**
 * Created by Test on 10/1/2014.
 */
public class configHandler
{
    public static Configuration config;
    public static boolean configValue = false;

    public static void init(File configFile)
    {
        if(config == null)
        {
            config = new Configuration(configFile);
            loadConfig();
        }
    }

    @SubscribeEvent
    public void onConfigChangedEvent(ConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(MOD_ID))
        {
            loadConfig();
        }
    }

    private static void loadConfig()
    {
        configValue = config.getBoolean("config value",Configuration.CATEGORY_GENERAL, true, "Example");
        if(config.hasChanged())
        {
            config.save();
        }
    }
}

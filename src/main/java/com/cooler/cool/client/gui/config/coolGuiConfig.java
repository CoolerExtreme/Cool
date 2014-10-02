package com.cooler.cool.client.gui.config;

import static com.cooler.cool.reference.reference.*;

import cpw.mods.fml.client.config.GuiConfig;
import cpw.mods.fml.client.config.IConfigElement;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

import java.util.List;

/**
 * Created by Test on 10/2/2014.
 */
public class coolGuiConfig extends GuiConfig
{
    public coolGuiConfig(GuiScreen guiScreen)
    {
        super(guiScreen, new ConfigElement(configHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(configHandler.config.toString()));
    }
}

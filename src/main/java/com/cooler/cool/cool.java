package com.cooler.cool;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.client.clientProxy;
import com.cooler.cool.client.gui.config.configHandler;
import com.cooler.cool.init.coolBlocks;
import com.cooler.cool.init.coolItems;
import com.cooler.cool.init.coolTileEntities;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.relauncher.Side;

/**
 * Created by Test on 10/1/2014.
 */
@Mod(modid= MOD_ID,name=MOD_NAME,version=VERSION,guiFactory = GUI_FACTORY)
public class cool
{
    @Mod.Instance("cool")
    public static cool instance;

    @SidedProxy(clientSide = "com.cooler.cool.client.clientProxy",serverSide = "com.cooler.cool.serverProxy",modId = "cool")
    public static iProxy proxy;

    //public static SimpleNetworkWrapper snw;

    @Mod.EventHandler
    public void PreInitialization(FMLPreInitializationEvent event)
    {
        configHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new configHandler());
        //snw = NetworkRegistry.INSTANCE.newSimpleChannel(MOD_ID);
        //snw.registerMessage(,, 0, Side.CLIENT);
        coolItems.init();
        coolBlocks.init();
        coolTileEntities.init();
        proxy.registerTESR();
    }

    @Mod.EventHandler
    public void Initialization(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void PostInitialization(FMLPostInitializationEvent event)
    {

    }
}

package com.cooler.cool.client;

import com.cooler.cool.client.renderer.tile.frozenRenderer;
import com.cooler.cool.client.renderer.tile.planetaryRenderer;
import com.cooler.cool.commonProxy;
import com.cooler.cool.tileEntity.tileFrozen;
import com.cooler.cool.tileEntity.tilePlanetary;
import cpw.mods.fml.client.registry.ClientRegistry;

/**
 * Created by Test on 10/1/2014.
 */
public class clientProxy extends commonProxy
{
    public void registerTESR()
    {
        ClientRegistry.bindTileEntitySpecialRenderer(tilePlanetary.class, new planetaryRenderer());
        ClientRegistry.bindTileEntitySpecialRenderer(tileFrozen.class, new frozenRenderer());
    }
}

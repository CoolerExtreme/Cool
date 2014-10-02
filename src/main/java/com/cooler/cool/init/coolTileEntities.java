package com.cooler.cool.init;

import com.cooler.cool.tileEntity.tileCool;
import com.cooler.cool.tileEntity.tilePlanetary;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Test on 10/2/2014.
 */
public class coolTileEntities
{
    public static final tileCool Planetary = new tilePlanetary();

    public static void init()
    {
        GameRegistry.registerTileEntity(tilePlanetary.class, "Planetary");
    }
}
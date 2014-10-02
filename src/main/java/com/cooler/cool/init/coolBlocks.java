package com.cooler.cool.init;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.block.blockCool;
import com.cooler.cool.block.blockPlanetary;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Test on 10/2/2014.
 */
@GameRegistry.ObjectHolder(MOD_ID)
public class coolBlocks
{
    public static final blockCool planetary = new blockPlanetary();

    public static void init()
    {
        GameRegistry.registerBlock(planetary, planetary.getUnlocalizedName().substring(5));
    }
}

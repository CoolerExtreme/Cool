package com.cooler.cool.init;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.item.itemCool;
import com.cooler.cool.item.itemFrog;
import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Created by Test on 10/2/2014.
 */
@GameRegistry.ObjectHolder(MOD_ID)
public class coolItems
{
    public static final itemCool frog = new itemFrog();

    public static void init()
    {
        GameRegistry.registerItem(frog, frog.getUnlocalizedName().substring(5));
    }
}

package com.cooler.cool.creativeTab;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.init.coolItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Test on 10/2/2014.
 */
public class creativeTabCool
{
    public static final CreativeTabs coolTab = new CreativeTabs(MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
            return coolItems.frog;
        }
    };
}

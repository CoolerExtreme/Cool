package com.cooler.cool.item;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.creativeTab.creativeTabCool;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

/**
 * Created by Test on 10/2/2014.
 */
public class itemCool extends Item
{
    public itemCool()
    {
        super();
        this.setCreativeTab(creativeTabCool.coolTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon(MOD_ID+":"+this.getUnlocalizedName().substring(5));
    }
}

package com.cooler.cool.block;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.creativeTab.creativeTabCool;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

/**
 * Created by Test on 10/2/2014.
 */
public class blockCool extends Block
{
    public blockCool(Material material)
    {
        super(material);
        this.setCreativeTab(creativeTabCool.coolTab);
    }

    public blockCool()
    {
        super(Material.rock);
        this.setCreativeTab(creativeTabCool.coolTab);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(MOD_ID+":"+this.getUnlocalizedName().substring(5));
    }
}

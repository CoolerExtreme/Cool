package com.cooler.cool.item;

import com.cooler.cool.block.blockFrozen;
import com.cooler.cool.block.blockPlanetary;
import com.cooler.cool.init.coolBlocks;
import com.cooler.cool.tileEntity.tileFrozen;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import org.lwjgl.Sys;

/**
 * Created by Test on 10/6/2014.
 */
public class itemFreeze extends itemCool
{
    public itemFreeze()
    {
        super();
        this.setUnlocalizedName("ItemFreeze");
    }

    @Override
    public boolean onItemUse(ItemStack p_77648_1_, EntityPlayer p_77648_2_, World p_77648_3_, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
        return true;
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
        Block block = world.getBlock(x, y, z);
        if (block == null)
        {
            return false;
        }
        ItemStack icon = new ItemStack(block.getItem(world, x, y, z));
        if(!world.isRemote)
        {
            world.setBlock(x, y, z, coolBlocks.frozen);
            ((tileFrozen)world.getTileEntity(x, y, z)).setFrozenIcon(icon);
        }
        return false;
    }
}
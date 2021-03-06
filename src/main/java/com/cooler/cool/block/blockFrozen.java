package com.cooler.cool.block;

import com.cooler.cool.item.itemFrog;
import com.cooler.cool.tileEntity.tileFrozen;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Test on 10/6/2014.
 */
public class blockFrozen extends blockCool implements ITileEntityProvider
{
    public blockFrozen()
    {
        super();
        this.setBlockName("BlockFrozen");
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return false;
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if(player.getCurrentEquippedItem()!=null && player.getCurrentEquippedItem().getItem() instanceof itemFrog)
        {
            if(!world.isRemote)
            System.out.println("You just right clicked that block with a frog!");
            return true;
        }
        return false;
    }

    @Override
    public TileEntity createNewTileEntity(World world, int p_149915_2_)
    {
        return new tileFrozen();
    }

    /*@Override
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess iBlockAccess, int x, int y, int z, int side)
    {
        tileFrozen frozen = (tileFrozen)iBlockAccess.getTileEntity(x, y, z);
        if(frozen != null)
        {
            Block block = Block.getBlockById(frozen.frozenID);
            return block.getIcon(side, frozen.frozenMeta);
        }
        else
            return this.blockIcon;
    }*/
}
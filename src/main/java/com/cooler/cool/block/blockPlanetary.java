package com.cooler.cool.block;

import com.cooler.cool.tileEntity.tileCool;
import com.cooler.cool.tileEntity.tilePlanetary;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

/**
 * Created by Test on 10/2/2014.
 */
public class blockPlanetary extends blockCool
{
    public blockPlanetary()
    {
        super();
        this.setBlockName("BlockPlanetary");
    }

    @Override
    public TileEntity createTileEntity(World world, int metadata)
    {
        return new tilePlanetary();
    }

    @Override
    public boolean shouldSideBeRendered(IBlockAccess iblockaccess, int i, int j, int k, int l)
    {
        return false;
    }

    @Override
    public boolean isOpaqueCube()
    {
        return false;
    }
}

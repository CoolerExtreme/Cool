package com.cooler.cool.block;

import com.cooler.cool.tileEntity.tilePlanetary;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import static com.cooler.cool.reference.reference.MOD_ID;

/**
 * Created by Test on 10/2/2014.
 */
public class blockPlanetary extends blockCool implements ITileEntityProvider
{
    public static IIcon icons[] = new IIcon[3];
    public blockPlanetary()
    {
        super();
        this.setBlockName("BlockPlanetary");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(MOD_ID+":"+this.getUnlocalizedName().substring(5));
        icons[0] = iconRegister.registerIcon(MOD_ID+":modelSun");
        icons[1] = iconRegister.registerIcon(MOD_ID+":modelEarth");
        icons[2] = iconRegister.registerIcon(MOD_ID+":modelMoon");
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

    @Override
    public TileEntity createNewTileEntity(World world, int metadata)
    {
        return new tilePlanetary();
    }
}

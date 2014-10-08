package com.cooler.cool.client.renderer.tile;

import com.cooler.cool.tileEntity.tileFrozen;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

/**
 * Created by Test on 10/9/2014.
 */
public class frozenRenderer extends TileEntitySpecialRenderer
{
    private RenderBlocks renderBlocks = new RenderBlocks();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        Tessellator tessellator = Tessellator.instance;
        tessellator.startDrawingQuads();
        Block block = Block.getBlockById(((tileFrozen) tileEntity).frozenID);
        renderBlocks.blockAccess = tileEntity.getWorldObj();
        renderBlocks.renderBlockByRenderType(block, tileEntity.xCoord, tileEntity.yCoord, tileEntity.zCoord);
        tessellator.draw();
        GL11.glPopMatrix();
    }
}

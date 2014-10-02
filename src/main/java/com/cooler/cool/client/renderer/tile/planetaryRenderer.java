package com.cooler.cool.client.renderer.tile;

import assets.cool.models.modelTest;
import com.cooler.cool.tileEntity.tilePlanetary;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import org.lwjgl.opengl.GL11;

/**
 * Created by Test on 10/2/2014.
 */
public class planetaryRenderer extends TileEntitySpecialRenderer
{
    public static final modelTest model = new modelTest();

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        System.out.println("Rendering!!!!!!!!!!!!!!!");
        GL11.glPushMatrix();
        this.bindTexture(TextureMap.locationBlocksTexture);
        GL11.glTranslatef((float) x, (float) y, (float) z);
        model.render(null, 0, 0, 0, 0, 0, 0.0625f);
        GL11.glPopMatrix();
    }
}

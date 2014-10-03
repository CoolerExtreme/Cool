package com.cooler.cool.client.renderer.tile;

import static com.cooler.cool.reference.reference.*;

import assets.cool.models.modelTest;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

/**
 * Created by Test on 10/2/2014.
 */
public class planetaryRenderer extends TileEntitySpecialRenderer
{
    public static final modelTest model = new modelTest();
    private float angle = 0.0f;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        this.bindTexture(new ResourceLocation(MOD_ID, "textures/blocks/BlockPlanetary.png"));
        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        GL11.glTranslatef(0.5f,-0.75f,0.5f);
        model.Sun.render(0.0625f);
        angle += f;
        if(angle >= 360.0f)angle -= 360.0f;
        GL11.glPushMatrix();
        GL11.glRotatef(angle, 0, 1.0f, 0);
        GL11.glTranslatef(1.0f,0,0);
        model.Earth.render(0.0625f);
        GL11.glPushMatrix();
        GL11.glRotatef(angle, 1.0f, 0, 0);
        GL11.glTranslatef(0,0.5f,0);
        model.Moon.render(0.0625f);
        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
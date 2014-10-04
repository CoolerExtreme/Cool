package com.cooler.cool.client.renderer.tile;

import static com.cooler.cool.reference.reference.*;

import com.cooler.cool.block.blockPlanetary;
import com.cooler.cool.util.objRendering;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.obj.WavefrontObject;
import org.lwjgl.opengl.GL11;

/**
 * Created by Test on 10/2/2014.
 */
public class planetaryRenderer extends TileEntitySpecialRenderer
{
    WavefrontObject modelSun;
    WavefrontObject modelEarth;
    WavefrontObject modelMoon;
    private float angle = 0.0f;
    private float angleMoon = 0.0f;

    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float f)
    {
        modelSun = new WavefrontObject(new ResourceLocation(MOD_ID,"models/modelSun.obj"));
        modelEarth = new WavefrontObject(new ResourceLocation(MOD_ID,"models/modelEarth.obj"));
        modelMoon = new WavefrontObject(new ResourceLocation(MOD_ID,"models/modelMoon.obj"));

        GL11.glPushMatrix();
        GL11.glTranslatef((float) x, (float) y, (float) z);
        this.bindTexture(new ResourceLocation(MOD_ID,"textures/blocks/modelSun.png"));
        modelSun.renderAll();

        angle++;
        if(angle >= 360.0f)angle -= 360.0f;

        GL11.glPushMatrix();
        GL11.glRotatef(angle, 0, 1.0f, 0);
        GL11.glTranslatef(4.0f,0,0);
        GL11.glRotatef(-angle, 0, 1.0f, 0);
        this.bindTexture(new ResourceLocation(MOD_ID,"textures/blocks/modelEarth.png"));
        modelEarth.renderAll();

        angleMoon += 4;
        if(angleMoon >= 360.0f)angleMoon -= 360.0f;

        GL11.glPushMatrix();
        GL11.glRotatef(40.0f, 1.0f, 0, 1.0f);
        GL11.glRotatef(angleMoon, 0, 1.0f, 0);
        GL11.glTranslatef(1.0f, 0, 0);
        this.bindTexture(new ResourceLocation(MOD_ID,"textures/blocks/modelMoon.png"));
        modelMoon.renderAll();

        GL11.glPopMatrix();
        GL11.glPopMatrix();
        GL11.glPopMatrix();
    }
}
package assets.cool.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class modelTest extends ModelBase
{
  //fields
    ModelRenderer Sun;
    ModelRenderer Earth;
    ModelRenderer Moon;
  
  public modelTest()
  {
      textureWidth = 64;
      textureHeight = 64;
      Sun = new ModelRenderer(this, 0, 0);
      Sun.addBox(-4F, -4F, -4F, 8, 8, 8);
      Sun.setRotationPoint(0F, 20F, 0F);
      Sun.setTextureSize(64, 64);
      Sun.mirror = true;
      setRotation(Sun, 0F, 0F, 0F);
      Earth = new ModelRenderer(this, 0, 0);
      Earth.addBox(-2F, -2F, -2F, 4, 4, 4);
      Earth.setRotationPoint(-10F, 20F, 0F);
      Earth.setTextureSize(64, 64);
      Earth.mirror = true;
      setRotation(Earth, 0F, 0F, 0F);
      Moon = new ModelRenderer(this, 0, 0);
      Moon.addBox(-1F, -1F, -1F, 2, 2, 2);
      Moon.setRotationPoint(-10F, 14F, 0F);
      Moon.setTextureSize(64, 64);
      Moon.mirror = true;
      setRotation(Moon, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Sun.render(f5);
    Earth.render(f5);
    Moon.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}

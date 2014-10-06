package com.cooler.cool.tileEntity;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.IIcon;

/**
 * Created by Test on 10/6/2014.
 */
public class tileFrozen extends tileCool
{
    public ItemStack frozenItemstack;

    @Override
    public void readFromNBT(NBTTagCompound tagCompound)
    {
        super.readFromNBT(tagCompound);
        NBTTagCompound tagCompound1 = new NBTTagCompound();
        tagCompound1 = (NBTTagCompound)tagCompound.getTag("Icon");
        if(tagCompound1 != null)
            frozenItemstack.setTagCompound(tagCompound1);
    }

    @Override
    public void writeToNBT(NBTTagCompound tagCompound)
    {
        super.writeToNBT(tagCompound);
        if(frozenItemstack != null)
            tagCompound.setTag("Icon",frozenItemstack.getTagCompound());
    }

    public void setFrozenIcon(ItemStack icon)
    {
        if(icon != null)
            frozenItemstack = icon;
    }
}
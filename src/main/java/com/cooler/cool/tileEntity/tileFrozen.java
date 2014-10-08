package com.cooler.cool.tileEntity;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.Packet;
import net.minecraft.network.play.server.S35PacketUpdateTileEntity;
import net.minecraft.world.World;
import org.lwjgl.Sys;

/**
 * Created by Test on 10/6/2014.
 */
public class tileFrozen extends tileCool
{
    public int frozenID = 0;
    public int frozenMeta = 0;

    @Override
    public void readFromNBT(NBTTagCompound tagCompound)
    {
        super.readFromNBT(tagCompound);
        frozenID = tagCompound.getInteger("Frozen ID");
        frozenMeta = tagCompound.getInteger("Frozen Meta");
    }

    @Override
    public void writeToNBT(NBTTagCompound tagCompound)
    {
        super.writeToNBT(tagCompound);
        tagCompound.setInteger("Frozen ID", frozenID);
        tagCompound.setInteger("Frozen Meta", frozenMeta);
    }

    public void setFrozenBlockData(int id, int meta,World world)
    {
        this.frozenID = id;
        this.frozenMeta = meta;
        world.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
    }

    @Override
    public Packet getDescriptionPacket()
    {
        NBTTagCompound nbt = new NBTTagCompound();
        this.writeToNBT(nbt);
        return new S35PacketUpdateTileEntity(this.xCoord, this.yCoord, this.zCoord, 0, nbt);
    }

    @Override
    public void onDataPacket(NetworkManager net, S35PacketUpdateTileEntity packet)
    {
        this.readFromNBT(packet.func_148857_g());
    }
}
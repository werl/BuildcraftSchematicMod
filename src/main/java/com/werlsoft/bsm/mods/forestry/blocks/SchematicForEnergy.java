package com.werlsoft.bsm.mods.forestry.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicForEnergy extends SchematicForRotation {
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if (this.tileNBT.hasKey("EnergyManager")){
			NBTTagCompound energyManager = this.tileNBT.getCompoundTag("EnergyManager");
			if (energyManager.hasKey("EnergyStorage")){
				NBTTagCompound energyStorage = this.tileNBT.getCompoundTag("EnergyStorage");
				if (energyStorage.hasKey("Energy")){
					energyStorage.setInteger("Energy", 0);
				}
				energyManager.setTag("EnergyStorage", energyStorage);
			}
			this.tileNBT.setTag("EnergyManager", energyManager);
		}
		
		if (this.tileNBT.hasKey("IC2BasicSource")){
			NBTTagCompound ic2 = this.tileNBT.getCompoundTag("IC2BasicSource");
			if(ic2.hasKey("energy"))
				ic2.setDouble("energy", 0.0D);
			this.tileNBT.setTag("IC2BasicSource", ic2);
		}
		
		if(this.tileNBT.hasKey("IC2BasicSink")){
			NBTTagCompound ic2 = this.tileNBT.getCompoundTag("IC2BasicSink");
			if(ic2.hasKey("energy"))
				ic2.setDouble("energy", 0.0D);
			this.tileNBT.setTag("IC2BasicSink", ic2);
		}
		
		super.writeToWorld(context, x, y, z, stacks);
	}
}

package com.werlsoft.bsm.mods.forestry.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicForFactory extends SchematicForEnergy {
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if (this.tileNBT.hasKey("ProductionTime"))
			this.tileNBT.setInteger("ProductionTime", 0);
		if (this.tileNBT.hasKey("TimePerItem"))
			this.tileNBT.setInteger("TimePerItem", 0);
		if (this.tileNBT.hasKey("PendingProducts"))
			this.tileNBT.setTag("PendingProducts", new NBTTagList());
		if (this.tileNBT.hasKey("tanks"))
			this.tileNBT.setTag("tanks", new NBTTagList());
		if (this.tileNBT.hasKey("PackageTime"))
			this.tileNBT.setInteger("PackageTime", 0);
		if (this.tileNBT.hasKey("PackageTotalTime"))
			this.tileNBT.setInteger("PackageTotalTime", 0);
		if (this.tileNBT.hasKey("FermentationTime"))
			this.tileNBT.setInteger("FermentationTime", 0);
		if (this.tileNBT.hasKey("FermentationTotalTime"))
			this.tileNBT.setInteger("FermentationTotalTime", 0);
		if (this.tileNBT.hasKey("FuelBurnTime"))
			this.tileNBT.setInteger("FuelBurnTime", 0);
		if (this.tileNBT.hasKey("FuelCurrentFerment"))
			this.tileNBT.setInteger("FuerCurrentFerment", 0);
		if (this.tileNBT.hasKey("FuelTotalTime"))
			this.tileNBT.setInteger("FuelTotalTime", 0);
		if (this.tileNBT.hasKey("BurnTime"))
			this.tileNBT.setInteger("BurnTime", 0);
		if (this.tileNBT.hasKey("DistillationTime"))
			this.tileNBT.setInteger("DistillationTime", 0);
		if (this.tileNBT.hasKey("DistillationTotalTime"))
			this.tileNBT.setInteger("DistillationTotalTime", 0);
		if (this.tileNBT.hasKey("Charge"))
			this.tileNBT.setInteger("Charge", 0);
		if (this.tileNBT.hasKey("Duration"))
			this.tileNBT.setInteger("Duration", 0);
		
		super.writeToWorld(context, x, y, z, stacks);
	}
}

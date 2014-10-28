package com.werlsoft.bsm.mods.ic2.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicIC2EnergyStorage extends SchematicIC2Rotation {
	
	@Override
	public void placeInWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("energy"))
			this.tileNBT.setDouble("energy", 0);
		if(this.tileNBT.hasKey("storage"))
			this.tileNBT.setDouble("storage", 0);
		if(this.tileNBT.hasKey("fuel"))
			this.tileNBT.setInteger("fuel", 0);
		if(this.tileNBT.hasKey("progress"))
			this.tileNBT.setShort("progress", (short) 0);
		super.placeInWorld(context, x, y, z, stacks);
		
	}
}

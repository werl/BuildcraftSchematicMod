package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicKillerJoe extends SchematicEIORotation {
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("fuelTank"))
			this.tileNBT.removeTag("fuelTank");
		
		super.writeToWorld(context, x, y, z, stacks);
	}

}
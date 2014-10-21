package com.werlsoft.bsm.mods.tconstruct.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicLavaTank extends SchematicTConRotation {
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("fluidName"))
			this.tileNBT.removeTag("fluidName");
		if(this.tileNBT.hasKey("amount"))
			this.tileNBT.removeTag("amount");
		if(this.tileNBT.hasKey("hasFluid"))
			this.tileNBT.setBoolean("hasFluid", false);
		
		super.writeToWorld(context, x, y, z, stacks);
	}
}

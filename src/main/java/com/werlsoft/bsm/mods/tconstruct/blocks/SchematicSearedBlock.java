package com.werlsoft.bsm.mods.tconstruct.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicSearedBlock extends SchematicTConRotation {
	@Override
	public void placeInWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("Fluid"))
			this.tileNBT.removeTag("Fluid");
		if(this.tileNBT.hasKey("hasLiquid"))
			this.tileNBT.setBoolean("hasLiquid", false);
		
		super.placeInWorld(context, x, y, z, stacks);
	}
}

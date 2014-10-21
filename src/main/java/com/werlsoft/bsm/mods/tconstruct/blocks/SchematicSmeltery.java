package com.werlsoft.bsm.mods.tconstruct.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;


public class SchematicSmeltery extends SchematicTConRotation {
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("CurrentLiquid"))
			this.tileNBT.setInteger("CurrentLiquid", 0);
		if(this.tileNBT.hasKey("Liquids"))
			this.tileNBT.removeTag("Liquids");
		if(this.tileNBT.hasKey("hasFluid"))
			this.tileNBT.setBoolean("hasFluid", false);
		super.writeToWorld(context, x, y, z, stacks);
	}
	
}

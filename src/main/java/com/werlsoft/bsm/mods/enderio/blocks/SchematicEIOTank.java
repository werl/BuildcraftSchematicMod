package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicEIOTank extends SchematicEIORotation {
	
	@Override
	public void placeInWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("tankContents"))
			this.tileNBT.removeTag("tankContents");
		
		super.placeInWorld(context, x, y, z, stacks);
	}
	
}

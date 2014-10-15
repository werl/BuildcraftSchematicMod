package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicVat extends SchematicEIOEnergy {

	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("inputTank"))
			this.tileNBT.removeTag("inputTank");
		if(this.tileNBT.hasKey("outputTank"))
			this.tileNBT.removeTag("outputTank");
		
		super.writeToWorld(context, x, y, z, stacks);
	}
	
}

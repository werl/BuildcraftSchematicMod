package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicZombieGenerator extends SchematicEIOEnergy {
	
	@Override
	public void placeInWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if(this.tileNBT.hasKey("fuelTank"))
			this.tileNBT.removeTag("fuelTank");
		
		super.placeInWorld(context, x, y, z, stacks);
	}

}

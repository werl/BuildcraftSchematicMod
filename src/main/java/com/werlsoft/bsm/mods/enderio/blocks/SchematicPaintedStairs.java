package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicPaintedStairs extends SchematicTile {
	
	@Override
	public void writeRequirementsToWorld(IBuilderContext context, LinkedList<ItemStack> requirements) {
		requirements.add(new ItemStack(block, 1, 0));
	}

	@Override
	public void writeRequirementsToBlueprint(IBuilderContext context, int x, int y, int z) {

	}

	@Override
	public boolean isAlreadyBuilt(IBuilderContext context, int x, int y, int z) {
		return block == context.world().getBlock(x, y, z);
	}

	@Override
	public void rotateLeft(IBuilderContext context) {
		int pos = meta & 3;
		int others = meta - pos;

		switch (pos) {
		case 0:
			pos = 2;
			break;
		case 1:
			pos = 3;
			break;
		case 2:
			pos = 1;
			break;
		case 3:
			pos = 0;
			break;
		}

		meta = pos + others;
	}
	
	@Override
	public double getEnergyRequirement(LinkedList<ItemStack> stacksUsed) {
		double result = 0;

		for (ItemStack s : stacksUsed) {
			result += s.stackSize * SchematicRegistry.BUILD_ENERGY;
		}
		result += SchematicRegistry.BUILD_ENERGY / 2;

		return result;
	}

}

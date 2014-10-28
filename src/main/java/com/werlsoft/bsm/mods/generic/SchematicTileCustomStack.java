package com.werlsoft.bsm.mods.generic;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.BuilderAPI;
import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicTileCustomStack extends SchematicTile {
	final ItemStack customStack;
	final double extraPower;

	public SchematicTileCustomStack(ItemStack customStack, double exPower) {
		this.customStack = customStack;
		this.extraPower = exPower;
	}

	@Override
	public void getRequirementsForPlacement(IBuilderContext context, LinkedList<ItemStack> requirements) {
		requirements.add(customStack.copy());
	}

	@Override
	public void storeRequirements(IBuilderContext context, int x, int y, int z) {
		// cancel requirements reading
	}
	
	@Override
	public int getEnergyRequirement(LinkedList<ItemStack> stacksUsed) {
		int result = 0;

		for (ItemStack s : stacksUsed) {
			result += s.stackSize * BuilderAPI.BUILD_ENERGY;
		}
		result += this.extraPower;

		return result;
	}
}

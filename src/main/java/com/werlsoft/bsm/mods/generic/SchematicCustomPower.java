package com.werlsoft.bsm.mods.generic;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicCustomPower extends SchematicTile {
	private final double extraPower;

	public SchematicCustomPower(double exPower) {
		this.extraPower = exPower;
	}
	
	@Override
	public double getEnergyRequirement(LinkedList<ItemStack> stacksUsed) {
		double result = 0;

		for (ItemStack s : stacksUsed) {
			result += s.stackSize * SchematicRegistry.BUILD_ENERGY;
		}
		result += this.extraPower;

		return result;
	}

}

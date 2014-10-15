package com.werlsoft.bsm.mods.generic;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.builders.schematics.SchematicRotateMeta;

public class SchematicCustomRotateMeta extends SchematicRotateMeta {
	
	final ItemStack customStack;
	final double extraPower;
	
	public SchematicCustomRotateMeta(int[] rotations, boolean rotateForward, ItemStack stack, double exPower) {
		super(rotations, rotateForward);
		this.customStack = stack;
		this.extraPower = exPower;
	}
	
	@Override
	public void writeRequirementsToWorld(IBuilderContext context, LinkedList<ItemStack> requirements) {
		requirements.add(customStack.copy());
	}

	@Override
	public void writeRequirementsToBlueprint(IBuilderContext context, int x, int y, int z) {
		// cancel requirements reading
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

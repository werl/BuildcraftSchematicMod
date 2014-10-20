package com.werlsoft.bsm.util;

import buildcraft.api.blueprints.SchematicRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class RegistryHelper {
	
	public static void registerSchematicItemStack(ItemStack stack, Class clas, Object ... params){
		SchematicRegistry.registerSchematicBlock(Block.getBlockFromItem(stack.getItem()), clas, params);
	}

}

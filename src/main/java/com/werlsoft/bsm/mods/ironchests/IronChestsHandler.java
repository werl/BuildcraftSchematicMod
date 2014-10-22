package com.werlsoft.bsm.mods.ironchests;

import com.werlsoft.bsm.mods.ironchests.blocks.SchematicIronChest;

import cpw.mods.ironchest.IronChest;
import buildcraft.api.blueprints.SchematicRegistry;

public class IronChestsHandler {
	public static void init(){
		SchematicRegistry.declareBlueprintSupport("IronChest");
		
		try {
			SchematicRegistry.registerSchematicBlock(IronChest.ironChestBlock, SchematicIronChest.class);
		} catch (Exception e) {}
	}
}

package com.werlsoft.bsm.mods.ironchests;

import com.werlsoft.bsm.mods.ironchests.blocks.SchematicIronChest;

import cpw.mods.ironchest.IronChest;
import buildcraft.api.blueprints.SchematicRegistry;

public class IronChestsHandler {
	public static void init(){
		SchematicRegistry.declareBlueprintSupport("IronChest");
		SchematicRegistry.registerSchematicBlock(IronChest.ironChestBlock, SchematicIronChest.class);
	}
}

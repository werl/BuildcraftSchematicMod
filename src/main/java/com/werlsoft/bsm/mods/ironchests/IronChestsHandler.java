package com.werlsoft.bsm.mods.ironchests;

import com.werlsoft.bsm.mods.ironchests.blocks.SchematicIronChest;
import com.werlsoft.bsm.registration.RegisterSchematic;

import cpw.mods.ironchest.IronChest;
import buildcraft.api.blueprints.SchematicRegistry;

public class IronChestsHandler {
	public static void init(){
		SchematicRegistry.declareBlueprintSupport("IronChest");
		
		//Register Chests
		RegisterSchematic.registerSchematic(IronChest.class, "ironChestBlock", SchematicIronChest.class);
	}
}

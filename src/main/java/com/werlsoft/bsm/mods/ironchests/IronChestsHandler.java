package com.werlsoft.bsm.mods.ironchests;

import com.werlsoft.bsm.mods.ironchests.blocks.SchematicIronChest;
import com.werlsoft.bsm.registration.RegisterSchematic;

import cpw.mods.ironchest.IronChest;

public class IronChestsHandler {
	public static void init(){
		
		//Register Chests
		RegisterSchematic.registerSchematic("IronChest:BockIronChest", SchematicIronChest.class);
	}
}

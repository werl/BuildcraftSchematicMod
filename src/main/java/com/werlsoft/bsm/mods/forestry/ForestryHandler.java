package com.werlsoft.bsm.mods.forestry;

import com.werlsoft.bsm.mods.forestry.blocks.SchematicForEngine;
import com.werlsoft.bsm.mods.forestry.blocks.SchematicForFactory;
import com.werlsoft.bsm.refernce.ModNames;
import com.werlsoft.bsm.registration.RegisterSchematic;

public class ForestryHandler {
	
	public static void init(){		
		RegisterSchematic.registerSchematic("Forestry:engine", SchematicForEngine.class);
		
		RegisterSchematic.registerSchematic("Forestry:factory", SchematicForFactory.class);
		
	}
}

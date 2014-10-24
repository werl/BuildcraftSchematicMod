package com.werlsoft.bsm.mods.fmp;

import com.werlsoft.bsm.mods.fmp.blocks.SchematicMultipart;
import com.werlsoft.bsm.registration.RegisterSchematic;

import net.minecraft.block.Block;
import buildcraft.api.blueprints.SchematicRegistry;

public class ForgeMultipartHandler {
	
	public static void init(){
		//Register Multipart 
		RegisterSchematic.registerSchematic("ForgeMultipart:block", SchematicMultipart.class);
	}

}

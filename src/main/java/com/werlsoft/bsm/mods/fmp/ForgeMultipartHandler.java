package com.werlsoft.bsm.mods.fmp;

import com.werlsoft.bsm.mods.fmp.blocks.SchematicMultipart;

import net.minecraft.block.Block;
import buildcraft.api.blueprints.SchematicRegistry;

public class ForgeMultipartHandler {
	
	public static void init(){
		SchematicRegistry.registerSchematicBlock((Block)Block.blockRegistry.getObject("ForgeMultipart:block"), SchematicMultipart.class);
	}

}

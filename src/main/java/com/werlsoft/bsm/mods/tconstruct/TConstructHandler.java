package com.werlsoft.bsm.mods.tconstruct;

import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSearedBlock;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSmeltery;

import tconstruct.smeltery.TinkerSmeltery;
import buildcraft.api.blueprints.SchematicRegistry;

public class TConstructHandler {
	
	public static void init(){
		//Smeltery Controller, Drain, Seared Bricks
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.smeltery, SchematicSmeltery.class);
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.smelteryNether, SchematicSmeltery.class);
		//Casting Table, Seared Faucet, Casting Basin
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.searedBlock, SchematicSearedBlock.class);
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.searedBlockNether, SchematicSearedBlock.class);
	}
}

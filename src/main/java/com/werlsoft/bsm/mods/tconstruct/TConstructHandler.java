package com.werlsoft.bsm.mods.tconstruct;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicLavaTank;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSearedBlock;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSmeltery;

import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.world.TinkerWorld;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.builders.schematics.SchematicFluid;
import buildcraft.builders.schematics.SchematicIgnore;

public class TConstructHandler {
	
	public static void init(){
		//Smeltery Controller, Drain, Seared Bricks
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.smeltery, SchematicSmeltery.class);
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.smelteryNether, SchematicSmeltery.class);
		//Casting Table, Seared Faucet, Casting Basin
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.searedBlock, SchematicSearedBlock.class);
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.searedBlockNether, SchematicSearedBlock.class);
		//Seared Tank, Glass, Window
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.lavaTank, SchematicLavaTank.class);
		SchematicRegistry.registerSchematicBlock(TinkerSmeltery.lavaTankNether, SchematicLavaTank.class);
		//Fluid blocks
		Block[] fluidBlocks = TinkerSmeltery.fluidBlocks;
		for(int i = 0; i < fluidBlocks.length; i ++){
			if(fluidBlocks[i].equals(TinkerWorld.slimePool))
				SchematicRegistry.registerSchematicBlock(fluidBlocks[i], SchematicIgnore.class);
			else
				SchematicRegistry.registerSchematicBlock(fluidBlocks[i], SchematicFluid.class, new ItemStack(TinkerSmeltery.buckets, 1, i));
			
			
		}
	}
}

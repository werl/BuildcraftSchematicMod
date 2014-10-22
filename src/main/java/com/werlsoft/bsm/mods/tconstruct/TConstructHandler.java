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
		try {
			SchematicRegistry.registerSchematicBlock(TinkerSmeltery.smeltery, SchematicSmeltery.class);
		} catch (Exception e) {}
		try {
			SchematicRegistry.registerSchematicBlock(TinkerSmeltery.smelteryNether, SchematicSmeltery.class);
		} catch (Exception e) {}
		//Casting Table, Seared Faucet, Casting Basin
		try {
			SchematicRegistry.registerSchematicBlock(TinkerSmeltery.searedBlock, SchematicSearedBlock.class);
		} catch (Exception e) {}
		try {
			SchematicRegistry.registerSchematicBlock(TinkerSmeltery.searedBlockNether, SchematicSearedBlock.class);
		} catch (Exception e) {}
		//Seared Tank, Glass, Window
		try {
			SchematicRegistry.registerSchematicBlock(TinkerSmeltery.lavaTank, SchematicLavaTank.class);
		} catch (Exception e) {}
		try {
			SchematicRegistry.registerSchematicBlock(TinkerSmeltery.lavaTankNether, SchematicLavaTank.class);
		} catch (Exception e) {}
		//Fluid blocks
		Block[] fluidBlocks = TinkerSmeltery.fluidBlocks;
		for(int i = 0; i < fluidBlocks.length; i ++) {
			//TODO remove when fixed
			if(fluidBlocks[i].equals(TinkerWorld.slimePool)) {
				try {
					SchematicRegistry.registerSchematicBlock(fluidBlocks[i], SchematicIgnore.class);
				} catch (Exception e) {}
			}
			else{
				try {
					SchematicRegistry.registerSchematicBlock(fluidBlocks[i], SchematicFluid.class, new ItemStack(TinkerSmeltery.buckets, 1, i));
				} catch (Exception e) {}
			}
		}
		
	}
}

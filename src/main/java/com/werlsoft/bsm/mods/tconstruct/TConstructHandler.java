package com.werlsoft.bsm.mods.tconstruct;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidContainerRegistry;

import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicLavaTank;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSearedBlock;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSmeltery;
import com.werlsoft.bsm.registration.RegisterSchematic;

import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.world.TinkerWorld;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.builders.schematics.SchematicFluid;
import buildcraft.builders.schematics.SchematicIgnore;

public class TConstructHandler {
	
	public static void init(){
		//Smeltery Controller, Drain, Seared Bricks
		RegisterSchematic.registerSchematic(TinkerSmeltery.class, "smeltery", SchematicSmeltery.class);
		RegisterSchematic.registerSchematic(TinkerSmeltery.class, "smelteryNether", SchematicSmeltery.class);
		
		//Casting Table, Seared Faucet, Casting Basin
		RegisterSchematic.registerSchematic(TinkerSmeltery.class, "searedBlock", SchematicSearedBlock.class);
		RegisterSchematic.registerSchematic(TinkerSmeltery.class, "searedBlockNether", SchematicSearedBlock.class);
		
		//Seared Tank, Glass, Window
		RegisterSchematic.registerSchematic(TinkerSmeltery.class, "lavaTank", SchematicLavaTank.class);
		RegisterSchematic.registerSchematic(TinkerSmeltery.class, "lavaTankNether", SchematicLavaTank.class);

		//Fluid blocks
		//TODO move to new registration system
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

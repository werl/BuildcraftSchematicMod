package com.werlsoft.bsm.mods.tconstruct;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;

import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicLavaTank;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSearedBlock;
import com.werlsoft.bsm.mods.tconstruct.blocks.SchematicSmeltery;
import com.werlsoft.bsm.registration.RegisterSchematic;
import com.werlsoft.bsm.util.LogHelper;

import tconstruct.smeltery.TinkerSmeltery;
import tconstruct.world.TinkerWorld;
import buildcraft.api.blueprints.SchematicFluid;
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
		/*Block[] fluidBlocks = TinkerSmeltery.fluidBlocks;
		Fluid[] fluid = TinkerSmeltery.fluids;
		for(int i = 0; i < fluidBlocks.length; i ++) {
			//TODO remove when fixed
			if(fluidBlocks[i].equals(TinkerWorld.slimePool)) {
				RegisterSchematic.registerSchematic(Block.blockRegistry.getNameForObject(fluidBlocks[i]), SchematicIgnore.class);
			}
			else if (fluidBlocks[i].equals(TinkerSmeltery.moltenInvar))
				continue;
			else{
				LogHelper.info(Block.blockRegistry.getNameForObject(fluidBlocks[i]));
				RegisterSchematic.registerSchematic(Block.blockRegistry.getNameForObject(fluidBlocks[i]), SchematicFluid.class, new FluidStack(fluid[i], 1000));
			}
		}*/
		
	}
}

package com.werlsoft.bsm.mods.enderio;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.werlsoft.bsm.mods.enderio.blocks.SchematicConduitBundle;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIOEnergy;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIOTank;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicKillerJoe;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicPoweredSpawner;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicVat;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicZombieGenerator;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIORotation;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicPaintedStairs;
import com.werlsoft.bsm.mods.generic.SchematicCustomPower;
import com.werlsoft.bsm.mods.generic.SchematicCustomRotateMeta;
import com.werlsoft.bsm.mods.generic.SchematicTileCustomStack;
import com.werlsoft.bsm.refernce.ModNames;

import crazypants.enderio.EnderIO;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.builders.schematics.SchematicIgnore;
import buildcraft.builders.schematics.SchematicRotateMeta;

public class EnderIOHandler {
	private static double paintEnergy = SchematicRegistry.BUILD_ENERGY / 2;
	
	public static void init(){
		SchematicRegistry.declareBlueprintSupport(ModNames.ENDER_IO);
		
		try{
			SchematicRegistry.registerSchematicBlock(EnderIO.blockConduitBundle, SchematicConduitBundle.class);
		} catch(Exception e){
			e.printStackTrace();
		}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockStirlingGenerator, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockCombustionGenerator, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockZombieGenerator, SchematicZombieGenerator.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		try {
			//TODO get this working
			SchematicRegistry.registerSchematicBlock(EnderIO.blockReservoir, SchematicIgnore.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockAlloySmelter, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockCrusher, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		try {
			//TODO get this working
			SchematicRegistry.registerSchematicBlock(EnderIO.blockHyperCube, SchematicIgnore.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPowerMonitor, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockVat, SchematicVat.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockFarmStation, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockTank, SchematicEIOTank.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockCrafter, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPoweredSpawner, SchematicPoweredSpawner.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockSliceAndSplice, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockSoulFuser, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockAttractor, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockSpawnGuard, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockKillerJoe, SchematicKillerJoe.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockEnchanter, SchematicEIORotation.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		try {
			//TODO get this working
			SchematicRegistry.registerSchematicBlock(EnderIO.blockElectricLight, SchematicIgnore.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		try {
			//TODO get this working
			SchematicRegistry.registerSchematicBlock(EnderIO.blockLightNode, SchematicIgnore.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPainter, SchematicEIOEnergy.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedFence, SchematicTileCustomStack.class, new ItemStack(Blocks.fence), paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedFenceGate, SchematicCustomRotateMeta.class, new int[]{0, 1, 2, 3}, true, new ItemStack(Blocks.fence_gate), paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedWall, SchematicTileCustomStack.class, new ItemStack(Blocks.cobblestone_wall), paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedStair, SchematicPaintedStairs.class);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedSlab, SchematicTileCustomStack.class, new ItemStack(Blocks.stone_slab), paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedDoubleSlab, SchematicTileCustomStack.class, new ItemStack(Blocks.stone_slab), paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedGlowstone, SchematicTileCustomStack.class, new ItemStack(Blocks.glowstone), paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
		try {
			SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedCarpet, SchematicCustomPower.class, paintEnergy);
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
}

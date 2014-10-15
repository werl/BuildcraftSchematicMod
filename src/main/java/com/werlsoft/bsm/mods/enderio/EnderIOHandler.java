package com.werlsoft.bsm.mods.enderio;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;

import com.werlsoft.bsm.mods.enderio.blocks.SchematicConduitBundle;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIOEnergy;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIORotation;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicPaintedStairs;
import com.werlsoft.bsm.mods.generic.SchematicCustomPower;
import com.werlsoft.bsm.mods.generic.SchematicCustomRotateMeta;
import com.werlsoft.bsm.mods.generic.SchematicTileCustomStack;

import crazypants.enderio.EnderIO;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.builders.schematics.SchematicRotateMeta;

public class EnderIOHandler {
	private static double paintEnergy = SchematicRegistry.BUILD_ENERGY / 2;
	
	public static void init(){
		SchematicRegistry.registerSchematicBlock(EnderIO.blockConduitBundle, SchematicConduitBundle.class);
		
		SchematicRegistry.registerSchematicBlock(EnderIO.blockStirlingGenerator, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockCombustionGenerator, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockZombieGenerator, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockReservoir, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockAlloySmelter, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockCrusher, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockHyperCube, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPowerMonitor, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockVat, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockFarmStation, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockTank, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockCrafter, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockPoweredSpawner, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockSliceAndSplice, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockSoulFuser, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockAttractor, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockSpawnGuard, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockKillerJoe, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockEnchanter, SchematicEIORotation.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockElectricLight, SchematicEIOEnergy.class);
		//SchematicRegistry.registerSchematicBlock(EnderIO.blockLightNode, SchematicEIOEnergy.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPainter, SchematicEIOEnergy.class);
		
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedFence, SchematicTileCustomStack.class, new ItemStack(Blocks.fence), paintEnergy);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedFenceGate, SchematicCustomRotateMeta.class, new int[]{0, 1, 2, 3}, true, new ItemStack(Blocks.fence_gate), paintEnergy);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedWall, SchematicCustomPower.class, paintEnergy);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedStair, SchematicPaintedStairs.class);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedSlab, SchematicCustomPower.class, paintEnergy);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedDoubleSlab, SchematicCustomPower.class, paintEnergy);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedGlowstone, SchematicTileCustomStack.class, new ItemStack(EnderIO.blockPaintedGlowstone), paintEnergy);
		SchematicRegistry.registerSchematicBlock(EnderIO.blockPaintedCarpet, SchematicCustomPower.class, paintEnergy);
	}
}

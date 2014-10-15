package com.werlsoft.bsm.mods.enderio;

import com.werlsoft.bsm.mods.enderio.blocks.SchematicConduitBundle;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIOEnergy;
import com.werlsoft.bsm.mods.enderio.blocks.SchematicEIORotation;

import crazypants.enderio.EnderIO;
import buildcraft.api.blueprints.SchematicRegistry;

public class EnderIOHandler {
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


		

		
		
		
	}
}

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
import com.werlsoft.bsm.registration.RegisterSchematic;

import crazypants.enderio.EnderIO;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.builders.schematics.SchematicIgnore;
import buildcraft.builders.schematics.SchematicRotateMeta;

public class EnderIOHandler {
	private static double paintEnergy = SchematicRegistry.BUILD_ENERGY / 2;
	
	public static void init(){
		SchematicRegistry.declareBlueprintSupport(ModNames.ENDER_IO);
		
		//Register Conduit Bundle
		RegisterSchematic.registerSchematic(EnderIO.class, "blockConduitBundle", SchematicConduitBundle.class);
		
		//Register Stirling Generator
		RegisterSchematic.registerSchematic(EnderIO.class, "blockStirlingGenerator", SchematicEIOEnergy.class);
		
		//Register Combustion Generator
		RegisterSchematic.registerSchematic(EnderIO.class, "blockCombustionGenerator", SchematicEIOEnergy.class);
		
		//Register Zombie Generator
		RegisterSchematic.registerSchematic(EnderIO.class, "blockZombieGenerator", SchematicZombieGenerator.class);
		
		//Register Reservoir
		//TODO get this working
		RegisterSchematic.registerSchematic(EnderIO.class, "blockReservoir", SchematicIgnore.class);
		
		//Register Alloy Smelter
		RegisterSchematic.registerSchematic(EnderIO.class, "blockAlloySmelter", SchematicEIOEnergy.class);
		
		//Register Crusher
		RegisterSchematic.registerSchematic(EnderIO.class, "blockCrusher", SchematicEIOEnergy.class);
		
		//Register Hyper Cube
		//TODO get this working
		RegisterSchematic.registerSchematic(EnderIO.class, "blockHyperCube", SchematicIgnore.class);
		
		//Register Power Monitor
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPowerMonitor", SchematicEIOEnergy.class);
		
		//Register Vat
		RegisterSchematic.registerSchematic(EnderIO.class, "blockVat", SchematicVat.class);
		
		//Register Farm Station
		RegisterSchematic.registerSchematic(EnderIO.class, "blockFarmStation", SchematicEIOEnergy.class);

		//Register Tank
		RegisterSchematic.registerSchematic(EnderIO.class, "blockTank", SchematicEIOTank.class);
			
		//Register Crafter
		RegisterSchematic.registerSchematic(EnderIO.class, "blockCrafter", SchematicEIOEnergy.class);

		//Register Powered Spawner
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPoweredSpawner", SchematicPoweredSpawner.class);
		
		//Register Slice 'n Splice
		RegisterSchematic.registerSchematic(EnderIO.class, "blockSLiceAndSplice", SchematicEIOEnergy.class);
		
		//Register Soul Fuser
		RegisterSchematic.registerSchematic(EnderIO.class, "blockSoulFuser", SchematicEIOEnergy.class);
		
		//Register Attractor
		RegisterSchematic.registerSchematic(EnderIO.class, "blockAttractor", SchematicEIOEnergy.class);

		//Register Spawn Guard
		RegisterSchematic.registerSchematic(EnderIO.class, "blockSpawnGuard", SchematicEIOEnergy.class);

		//Register Killer Joe
		RegisterSchematic.registerSchematic(EnderIO.class, "blockKillerJoe", SchematicKillerJoe.class);

		//Register Enchanter
		RegisterSchematic.registerSchematic(EnderIO.class, "blockEnchanter", SchematicEIORotation.class);
		
		//Register Electric Light
		//TODO get this working
		RegisterSchematic.registerSchematic(EnderIO.class, "blockElectricLight", SchematicIgnore.class);

		//Register Light Node
		//TODO get this working
		RegisterSchematic.registerSchematic(EnderIO.class, "blockLightNode", SchematicIgnore.class);

		//Register Painter
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPainter", SchematicEIOEnergy.class);
		
		//Register Painted Fence
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedFence", SchematicTileCustomStack.class, new ItemStack(Blocks.fence), paintEnergy);

		//Register Painted Gate
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedFenceGate", SchematicCustomRotateMeta.class, new int[]{0, 1, 2, 3}, true, new ItemStack(Blocks.fence_gate), paintEnergy);

		//Register Painted Wall
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedWall", SchematicTileCustomStack.class, new ItemStack(Blocks.cobblestone_wall), paintEnergy);

		//Register Painted Stairs
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedStair", SchematicPaintedStairs.class);

		//Register Painted Slab
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedSlab", SchematicTileCustomStack.class, new ItemStack(Blocks.stone_slab), paintEnergy);
		
		//Register Painted Double Slab
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedDoubleSlab", SchematicTileCustomStack.class, new ItemStack(Blocks.stone_slab), paintEnergy);
		
		//Register Painted Glowstone
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPiantedGlowstone", SchematicTileCustomStack.class, new ItemStack(Blocks.glowstone), paintEnergy);
		
		//Rigister Painted Carpet
		RegisterSchematic.registerSchematic(EnderIO.class, "blockPaintedCarpet", SchematicCustomPower.class, paintEnergy);
	}
}

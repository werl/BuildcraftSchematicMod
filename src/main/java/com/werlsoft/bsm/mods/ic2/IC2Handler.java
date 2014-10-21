package com.werlsoft.bsm.mods.ic2;

import com.werlsoft.bsm.mods.ic2.blocks.SchematicIC2EnergyStorage;
import com.werlsoft.bsm.util.RegistryHelper;

import net.minecraft.block.Block;
import ic2.api.item.IC2Items;
import buildcraft.api.blueprints.SchematicRegistry;

public class IC2Handler {
	
	public static void init(){
		RegistryHelper.registerSchematicItemStack(IC2Items.getItem("generator"), SchematicIC2EnergyStorage.class);	
	}

}

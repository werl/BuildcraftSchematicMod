package com.werlsoft.bsm.mods.forestry.blocks;

import java.util.LinkedList;

import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagList;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicForEngine extends SchematicForEnergy {
	
	@Override
	public void placeInWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		if (this.tileNBT.hasKey("ForceCooldown"))
			this.tileNBT.setBoolean("ForceCooldown", false);
		
		if (this.tileNBT.hasKey("tanks"))
			this.tileNBT.setTag("tanks", new NBTTagList());
		
		if (this.tileNBT.hasKey("EngineHeat"))
			this.tileNBT.setInteger("EngineHeat", 0);
		
		if (this.tileNBT.hasKey("EngineProgress"))
			this.tileNBT.setFloat("EngineProgress", 0.0F);
		
		if (this.tileNBT.hasKey("Wound"))
			this.tileNBT.setFloat("Wound", 0.0F);
		
		if (this.tileNBT.hasKey("sockets"))
			this.tileNBT.setTag("Sockets", new NBTTagList());
		
		if (this.tileNBT.hasKey("AshProduction"))
			this.tileNBT.setInteger("AshProduction", 0);
		
		if (this.tileNBT.hasKey("EngineBurnTime"))
			this.tileNBT.setInteger("EngineBurnTime", 0);
		
		if (this.tileNBT.hasKey("EngineFuelMeta"))
			this.tileNBT.setInteger("EngineFuelMeta", 0);
		
		if (this.tileNBT.hasKey("EngineTotalTime"))
			this.tileNBT.setInteger("EngineTotalTime", 0);
		
		super.placeInWorld(context, x, y, z, stacks);
	}
}

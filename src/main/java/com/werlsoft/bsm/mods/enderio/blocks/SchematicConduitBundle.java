package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.ForgeDirection;
import crazypants.enderio.EnderIO;
import crazypants.enderio.conduit.ConduitUtil;
import crazypants.enderio.conduit.IConduit;
import crazypants.enderio.conduit.TileConduitBundle;
import crazypants.enderio.conduit.gas.GasConduit;
import crazypants.enderio.conduit.item.ItemConduit;
import crazypants.enderio.conduit.liquid.AdvancedLiquidConduit;
import crazypants.enderio.conduit.liquid.EnderLiquidConduit;
import crazypants.enderio.conduit.liquid.LiquidConduit;
import crazypants.enderio.conduit.power.PowerConduit;
import crazypants.enderio.conduit.redstone.InsulatedRedstoneConduit;
import crazypants.enderio.conduit.redstone.RedstoneConduit;
import crazypants.enderio.conduit.redstone.RedstoneSwitch;
import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicRegistry;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicConduitBundle extends SchematicTile {
	
	@Override
	public void rotateLeft(IBuilderContext context) {
		short nbtVersion = this.tileNBT.getShort("nbtVersion");

		NBTTagList conduitTags = (NBTTagList) this.tileNBT.getTag("conduits");
		if (conduitTags != null) {
			for (int i = 0; i < conduitTags.tagCount(); i++) {
				NBTTagCompound conduitTag = conduitTags.getCompoundTagAt(i);
				if(conduitTag.hasKey("conduit")){
					NBTTagCompound conduit = conduitTag.getCompoundTag("conduit");
					if(conduit.hasKey("connections")){
						int[] connections = conduit.getIntArray("connections");
						for (int j = 0; j < connections.length; j++){
							int master = connections[j];
							switch(master){
							case 2:
								connections[j] = 5;
								break;
							case 3:
								connections[j] = 4;
								break;
							case 4:
								connections[j] = 2;
								break;
							case 5:
								connections[j] = 3;
							}
						}
					}
					
					conduitTag.setTag("conduit", conduit);
					conduitTags.func_150304_a(i, conduitTag);
				}
			}
		}
	}
	
	@Override
	public void writeRequirementsToWorld(IBuilderContext context, LinkedList<ItemStack> req) {
		List<IConduit> conduits = new ArrayList<IConduit>();
		
		short nbtVersion = this.tileNBT.getShort("nbtVersion");

		conduits.clear();
		NBTTagList conduitTags = (NBTTagList) this.tileNBT.getTag("conduits");
		if (conduitTags != null) {
			for (int i = 0; i < conduitTags.tagCount(); i++) {
				NBTTagCompound conduitTag = conduitTags.getCompoundTagAt(i);
				IConduit conduit = ConduitUtil.readConduitFromNBT(conduitTag, nbtVersion);
				if (conduit != null) {
					conduits.add(conduit);
				}
			}
		}

		for (IConduit conduit : conduits)
			req.add(conduit.createItem());

		if (Block.getBlockFromName(this.tileNBT.getString("facadeId")) != null) {
			ItemStack stack = new ItemStack(EnderIO.itemConduitFacade);
			// stack.stackTagCompound.setString("sourceBlockId", this.tileNBT.getString("facadeId"));
			// stack.stackTagCompound.setInteger("sourceBlockMeta", this.tileNBT.getInteger("facadeMeta"));
			req.add(stack);
		}
		// TODO make it specify a specific conduit facade
	}

	@Override
	public void writeRequirementsToBlueprint(IBuilderContext context, int x, int y, int z) {
		// cancel requirements reading
	}

	@Override
	public double getEnergyRequirement(LinkedList<ItemStack> stacksUsed) {
		double result = 0;

		for (ItemStack s : stacksUsed) {
			result += s.stackSize * SchematicRegistry.BUILD_ENERGY;
			if (s.getItem().equals(EnderIO.itemConduitFacade))
				result += SchematicRegistry.BUILD_ENERGY / 2;
		}

		return result;
	}
}

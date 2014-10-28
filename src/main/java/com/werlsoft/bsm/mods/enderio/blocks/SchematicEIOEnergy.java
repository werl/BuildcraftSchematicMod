package com.werlsoft.bsm.mods.enderio.blocks;

import java.util.LinkedList;

//import crazypants.enderio.machine.AbstractMachineEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import buildcraft.api.blueprints.IBuilderContext;

public class SchematicEIOEnergy extends SchematicEIORotation {
	
	@Override
	public void placeInWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		super.placeInWorld(context, x, y, z, stacks);

		if (block.hasTileEntity(meta)) {
			TileEntity tile = context.world().getTileEntity(x, y, z);
			/*if(tile instanceof AbstractMachineEntity){
				AbstractMachineEntity entity = (AbstractMachineEntity) tile;
				entity.setEnergyStored(0);
			}*/
		}
	}
}

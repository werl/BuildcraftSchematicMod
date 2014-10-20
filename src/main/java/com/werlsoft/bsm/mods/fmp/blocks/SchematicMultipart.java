package com.werlsoft.bsm.mods.fmp.blocks;

import java.util.LinkedList;

import codechicken.multipart.TileMultipart;
import codechicken.multipart.TileMultipartClient;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicMultipart extends SchematicTile {
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		// Meta needs to be specified twice, depending on the block behavior
		context.world().setBlock(x, y, z, block, meta, 3);
		context.world().setBlockMetadataWithNotify(x, y, z, meta, 3);
		System.out.println("d");
		
		if (block.hasTileEntity(meta)) {
			TileEntity tile = context.world().getTileEntity(x, y, z);

			tileNBT.setInteger("x", x);
			tileNBT.setInteger("y", y);
			tileNBT.setInteger("z", z);
			
			System.out.println("c");
			if(tile != null){
				System.out.println("a");
				if(tile instanceof TileMultipart){
					TileMultipart part = (TileMultipart) tile;
					System.out.println("b");
					context.world().setTileEntity(x, y, z, TileMultipartClient.createFromNBT(tileNBT));
				}
			}
		}
	}

}

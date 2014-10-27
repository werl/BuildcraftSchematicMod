package com.werlsoft.bsm.mods.fmp.blocks;

import java.util.LinkedList;

import com.werlsoft.bsm.mods.fmp.util.FMPRotationHelper;

import codechicken.multipart.MultipartHelper;
import codechicken.multipart.TileMultipart;
import codechicken.multipart.TileMultipartClient;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicMultipart extends SchematicTile {
	
	@Override
	public void rotateLeft(IBuilderContext context) {
		if (this.tileNBT.hasKey("parts")){
			NBTTagList list = (NBTTagList) this.tileNBT.getTag("parts");
			
			for (int i = 0; i < list.tagCount(); i++){
				NBTTagCompound tag = list.getCompoundTagAt(i);
				list.func_150304_a(i, FMPRotationHelper.rotationHandler(tag));
			}
			this.tileNBT.setTag("parts", list);
		}
	}
	
	@Override
	public void writeToWorld(IBuilderContext context, int x, int y, int z, LinkedList<ItemStack> stacks) {
		context.world().setBlock(x, y, z, block, meta, 3);
		context.world().setBlockMetadataWithNotify(x, y, z, meta, 3);
		
		if (block.hasTileEntity(meta)) {
			
			tileNBT.setInteger("x", x);
			tileNBT.setInteger("y", y);
			tileNBT.setInteger("z", z);
			
			context.world().setTileEntity(x, y, z, TileMultipartClient.createFromNBT(tileNBT));
			
			TileEntity tile = context.world().getTileEntity(x, y, z);
			
			if(tile != null){
				if(tile instanceof TileMultipart){
					TileMultipart part = (TileMultipart)tile;
					MultipartHelper.sendDescPacket(context.world(), part);
				}
			}
		}
	}

}

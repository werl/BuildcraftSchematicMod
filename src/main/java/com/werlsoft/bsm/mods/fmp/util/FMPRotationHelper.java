package com.werlsoft.bsm.mods.fmp.util;

import net.minecraft.nbt.NBTTagCompound;

public class FMPRotationHelper {
	
	public static NBTTagCompound rotationHandler(NBTTagCompound tag){
		NBTTagCompound iTag = tag;
		if (!tag.hasKey("id"))
			return iTag;
		
		String id = iTag.getString("id");
		
		switch (id){
		case "mc_torch":
			return rotateTorch(iTag);
		case "mc_redtorch":
			return rotateRedTorch(iTag);
		case "mc_button":
			return rotateButton(iTag);
		}
		
		return iTag;
	}
	
	private static NBTTagCompound rotateTorch(NBTTagCompound tag){
		if (!tag.hasKey("meta"))
			return tag;
		
		NBTTagCompound iTag = tag;
		int meta = iTag.getInteger("meta");
		
		switch (meta){
		case 1:
			iTag.setInteger("meta", 3);
		break;
		case 3:
			iTag.setInteger("meta", 2);
		break;
		case 2:
			iTag.setInteger("meta", 4);
		break;
		case 4:
			iTag.setInteger("meta", 1);
		break;
		case 5:break;
		}
		
		return iTag;
	}
	
	private static NBTTagCompound rotateRedTorch(NBTTagCompound tag){
		if (!tag.hasKey("meta"))
			return tag;
		
		NBTTagCompound iTag = tag;
		int meta = iTag.getInteger("meta");
		
		switch (meta){
		case 1:
			iTag.setInteger("meta", 3);
		break;
		case 3:
			iTag.setInteger("meta", 2);
		break;
		case 2:
			iTag.setInteger("meta", 4);
		break;
		case 4:
			iTag.setInteger("meta", 1);
		break;
		case 5:break;
		
		case 17:
			iTag.setInteger("meta", 19);
		break;
		case 19:
			iTag.setInteger("meta", 18);
		break;
		case 18:
			iTag.setInteger("meta", 20);
		break;
		case 20:
			iTag.setInteger("meta", 17);
		break;
		case 21:break;
		}
		
		return iTag;
	}
	
	private static NBTTagCompound rotateButton(NBTTagCompound tag){
		if (!tag.hasKey("meta"))
			return tag;
		
		NBTTagCompound iTag = tag;
		int meta = iTag.getInteger("meta");
		
		switch (meta){
		case 1:
			iTag.setInteger("meta", 3);
		break;
		case 3:
			iTag.setInteger("meta", 2);
		break;
		case 2:
			iTag.setInteger("meta", 4);
		break;
		case 4:
			iTag.setInteger("meta", 1);
		break;
		
		case 17:
			iTag.setInteger("meta", 19);
		break;
		case 19:
			iTag.setInteger("meta", 18);
		break;
		case 18:
			iTag.setInteger("meta", 20);
		break;
		case 20:
			iTag.setInteger("meta", 17);
		break;
		}
		
		return iTag;
	}
}

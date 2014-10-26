package com.werlsoft.bsm.registration;

import java.lang.reflect.Field;

import com.werlsoft.bsm.mods.enderio.blocks.SchematicConduitBundle;
import com.werlsoft.bsm.util.LogHelper;

import crazypants.enderio.EnderIO;
import net.minecraft.block.Block;
import buildcraft.api.blueprints.Schematic;
import buildcraft.api.blueprints.SchematicRegistry;

public class RegisterSchematic {
	
	@Deprecated
	public static boolean registerSchematic(Class blockClass, String fieldName, Class<? extends Schematic> schematic, Object ... params){
		Field f = null;
		
		try {
			f = blockClass.getField(fieldName);
		} catch (NoSuchFieldException e1) {
			e1.printStackTrace();
			return false;
		} catch (SecurityException e1) {
			e1.printStackTrace();
			return false;
		} catch (NullPointerException e1){
			e1.printStackTrace();
			return false;
		}
		
		Object obj = new Object();
		
		try {
			obj = f.get(f);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			return false;
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			return false;
		}
		
		if(obj == null || !(obj instanceof Block)){
			return false;
		}
		else{
			Block block = (Block)obj;
			SchematicRegistry.registerSchematicBlock(block, schematic, params);
			LogHelper.info("Registering: " + Block.blockRegistry.getNameForObject(block) + ". Using schematic: " + schematic.getName());
			return true;
		}
	}
	
	public static boolean registerSchematic(String modName, String blockName, Class<? extends Schematic> schematic, Object ... params ){
		return registerSchematic(modName + ":" + blockName, schematic, params);
	}
	
	public static boolean registerSchematic(String blockID, Class<? extends Schematic> schematic, Object ... params ){
		if(!Block.blockRegistry.containsKey(blockID)){
			LogHelper.error("The Block " + blockID + ", could not be found. THIS IS AN ERROR!!");
			return false;
		}
		else{
			SchematicRegistry.registerSchematicBlock((Block)Block.blockRegistry.getObject(blockID), schematic, params);
			LogHelper.info("Registering: " + blockID + ". Using schematic: " + schematic.getName());
			return true;
		}
	}
}

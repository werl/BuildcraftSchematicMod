package com.werlsoft.bsm;

import com.werlsoft.bsm.mods.enderio.EnderIOHandler;
import com.werlsoft.bsm.mods.fmp.ForgeMultipartHandler;
import com.werlsoft.bsm.mods.forestry.ForestryHandler;
import com.werlsoft.bsm.mods.ic2.IC2Handler;
import com.werlsoft.bsm.mods.ironchests.IronChestsHandler;
import com.werlsoft.bsm.mods.tconstruct.TConstructHandler;
import com.werlsoft.bsm.refernce.ModNames;
import com.werlsoft.bsm.refernce.Reference;
import com.werlsoft.bsm.util.LogHelper;
import com.werlsoft.bsm.util.TestBlock;
import com.werlsoft.bsm.util.TestItem;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION/*, guiFactory = Reference.GUI_FACTORY*/)
public class BuildcraftSchematicMod {
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		GameRegistry.registerBlock(new TestBlock(), "helperblock");
		GameRegistry.registerItem(new TestItem(), "testItem");
	}
	
	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event){
		if(Loader.isModLoaded(ModNames.IRON_CHEST))
			IronChestsHandler.init();
		if(Loader.isModLoaded(ModNames.ENDER_IO))
			EnderIOHandler.init();
		if(Loader.isModLoaded(ModNames.IC2))
			IC2Handler.init();
		if(Loader.isModLoaded(ModNames.FORGEMULTIPART))
			ForgeMultipartHandler.init();
		if(Loader.isModLoaded(ModNames.TCONSTRUCT))
			TConstructHandler.init();
		if(Loader.isModLoaded(ModNames.FORESTRY))
			ForestryHandler.init();
	}
}

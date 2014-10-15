package com.werlsoft.bsm;

import com.werlsoft.bsm.mods.enderio.EnderIOHandler;
import com.werlsoft.bsm.mods.ironchests.IronChestsHandler;
import com.werlsoft.bsm.refernce.ModNames;
import com.werlsoft.bsm.refernce.Reference;
import com.werlsoft.bsm.util.TestBlock;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY)
public class BuildcraftSchematicMod {
	
	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		if(Reference.MOD_VERSION.matches("@VERSION@"))
			GameRegistry.registerBlock(new TestBlock(), "helperblock");
		
		
		if(Loader.isModLoaded(ModNames.IRON_CHEST))
			IronChestsHandler.init();
		if(Loader.isModLoaded(ModNames.ENDER_IO))
			EnderIOHandler.init();
	}
}

package com.werlsoft.bsm.mods.forestry.blocks;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicForRotation extends SchematicTile {
	
	@Override
	public void rotateLeft(IBuilderContext context) {
		byte facing = this.tileNBT.getByte("Orientation");
		
		switch(facing){
		case 2:
			this.tileNBT.setInteger("Orientation", 5);
		break;
		case 3:
			this.tileNBT.setInteger("Orientation", 4);
		break;
		case 4:
			this.tileNBT.setInteger("Orientation", 2);
		break;
		case 5:
			this.tileNBT.setInteger("Orientation", 3);
		break;
		}
	}
}

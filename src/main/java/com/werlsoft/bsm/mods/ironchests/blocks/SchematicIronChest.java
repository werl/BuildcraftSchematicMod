package com.werlsoft.bsm.mods.ironchests.blocks;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicIronChest extends SchematicTile {
	
	@Override
	public void rotateLeft(IBuilderContext context) {
		byte facing = this.tileNBT.getByte("facing");
		
		switch(facing){
		case 2:
			this.tileNBT.setByte("facing", (byte) 5);
		break;
		case 3:
			this.tileNBT.setByte("facing", (byte) 4);
		break;
		case 4:
			this.tileNBT.setByte("facing", (byte) 2);
		break;
		case 5:
			this.tileNBT.setByte("facing", (byte) 3);
		break;
		default:
			this.tileNBT.setByte("facing", (byte) 2);
		break;
		}
	}
}

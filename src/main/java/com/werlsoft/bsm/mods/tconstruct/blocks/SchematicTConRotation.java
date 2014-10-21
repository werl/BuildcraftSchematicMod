package com.werlsoft.bsm.mods.tconstruct.blocks;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicTConRotation extends SchematicTile {
	
	@Override
	public void rotateLeft(IBuilderContext context) {
		byte facing = this.tileNBT.getByte("Direction");
		
		switch(facing){
		case 2:
			this.tileNBT.setByte("Direction", (byte) 5);
		break;
		case 3:
			this.tileNBT.setByte("Direction", (byte) 4);
		break;
		case 4:
			this.tileNBT.setByte("Direction", (byte) 2);
		break;
		case 5:
			this.tileNBT.setByte("Direction", (byte) 3);
		break;
		default:
			this.tileNBT.setByte("Direction", (byte) 2);
		break;
		}
	}
}

package com.werlsoft.bsm.mods.ic2.blocks;

import buildcraft.api.blueprints.IBuilderContext;
import buildcraft.api.blueprints.SchematicTile;

public class SchematicIC2Rotation extends SchematicTile {

	@Override
	public void rotateLeft(IBuilderContext context) {
		if (this.tileNBT.hasKey("facing")) {
			short facing = this.tileNBT.getShort("facing");

			switch (facing) {
			case 2:
				this.tileNBT.setShort("facing", (short) 5);
				break;
			case 3:
				this.tileNBT.setShort("facing", (short) 4);
				break;
			case 4:
				this.tileNBT.setShort("facing", (short) 2);
				break;
			case 5:
				this.tileNBT.setShort("facing", (short) 3);
				break;
			default:
				this.tileNBT.setShort("facing", (short) 2);
				break;
			}
		}
	}
}

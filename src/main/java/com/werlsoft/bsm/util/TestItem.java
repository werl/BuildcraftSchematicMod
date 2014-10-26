package com.werlsoft.bsm.util;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;

public class TestItem extends Item {
	
	public TestItem(){
		this.setUnlocalizedName("Test");
		this.setMaxStackSize(1);
	}
	
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int face, float p_77648_8_, float p_77648_9_, float p_77648_10_){
		Block block = world.getBlock(x, y, z);
		player.addChatMessage(new ChatComponentText(Block.blockRegistry.getNameForObject(block)));
        return true;
    }
}

package com.cesar.naturology.tabs;

import com.cesar.naturology.init.ModBlocks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class NatureBaseTab extends CreativeTabs {

	public NatureBaseTab(String label) {
		super(label);
		this.setBackgroundImageName("naturemain.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(Item.getItemFromBlock(ModBlocks.wooden_generator));
	}

}

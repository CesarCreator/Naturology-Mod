package com.cesar.naturology.objects;

import com.cesar.naturology.NaturologyMod;
import com.cesar.naturology.init.ModItems;
import com.cesar.naturology.proxy.ClientProxy;
import com.cesar.naturology.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {
	public ItemBase(String name) {
	
	setUnlocalizedName(name);
	setRegistryName(name);
	setCreativeTab(NaturologyMod.naturologyTab);
	
	ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		NaturologyMod.proxy.registerItemRenderer(this, 0, "inventory");
	}

}

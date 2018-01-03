package com.cesar.naturology;

import com.cesar.naturology.proxy.CommonProxy;
import com.cesar.naturology.tabs.NatureBaseTab;
import com.cesar.naturology.util.Reference;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NaturologyMod {
	
	@Instance
	public static NaturologyMod instance;
	
	public static final CreativeTabs naturologyTab = new NatureBaseTab("naturologyTab");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY , serverSide = Reference.COMMONPROXY)
	public static CommonProxy proxy;
	
	//Initialization Events... the worst part about making a mod. (Copy/Paste)
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
	
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
	
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
	
	}
	
	
}

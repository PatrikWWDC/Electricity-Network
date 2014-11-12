package com.PatrikWWDC.electricitynetwork;

import com.PatrikWWDC.electricitynetwork.handler.ConfigurationHandler;
import com.PatrikWWDC.electricitynetwork.init.*;
import com.PatrikWWDC.electricitynetwork.proxy.CommonProxy;
import com.PatrikWWDC.electricitynetwork.reference.Reference;
import com.PatrikWWDC.electricitynetwork.world.BlockGenerator;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NanoTech {

    @Mod.Instance(Reference.MOD_ID)
    public static NanoTech instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        ModTileEntities.init();
        ModItems.init();
        ModBlocks.init();
        ModGUI.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        Recipes.init();
        proxy.registerProxy();
        GameRegistry.registerWorldGenerator(new BlockGenerator(), 1);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}

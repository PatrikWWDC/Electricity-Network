package com.PatrikWWDC.electricitynetwork.init;

import com.PatrikWWDC.electricitynetwork.block.*;
import com.PatrikWWDC.electricitynetwork.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockEN siliconOre = new BlockSiliconOre();

    public static void init() {

        GameRegistry.registerBlock(siliconOre, "Silicon Ore");

    }

}

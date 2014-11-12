package com.PatrikWWDC.nanotech.init;

import com.PatrikWWDC.nanotech.block.*;
import com.PatrikWWDC.nanotech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks {

    public static final BlockEN siliconOre = new BlockSiliconOre();

    public static void init() {

        GameRegistry.registerBlock(siliconOre, "Silicon Ore");

    }

}

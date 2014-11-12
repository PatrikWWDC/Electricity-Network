package com.PatrikWWDC.electricitynetwork.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModBlocks.siliconOre), new ItemStack(ModItems.silicon), 10);
    }

}

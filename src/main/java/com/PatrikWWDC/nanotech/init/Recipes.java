package com.PatrikWWDC.nanotech.init;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Recipes {

    public static void init() {
        GameRegistry.addSmelting(new ItemStack(ModBlocks.siliconOre), new ItemStack(ModItems.silicon), 10);
    }

}

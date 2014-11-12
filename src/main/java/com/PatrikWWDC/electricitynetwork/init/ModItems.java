package com.PatrikWWDC.electricitynetwork.init;

import com.PatrikWWDC.electricitynetwork.item.*;
import com.PatrikWWDC.electricitynetwork.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemEN silicon = new ItemSilicon();

    public static void init() {
        GameRegistry.registerItem(silicon, "Silicon");
    }
}

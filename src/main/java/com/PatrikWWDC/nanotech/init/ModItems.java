package com.PatrikWWDC.nanotech.init;

import com.PatrikWWDC.nanotech.item.*;
import com.PatrikWWDC.nanotech.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems {

    public static final ItemEN silicon = new ItemSilicon();

    public static void init() {
        GameRegistry.registerItem(silicon, "Silicon");
    }
}

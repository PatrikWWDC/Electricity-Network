package com.PatrikWWDC.electricitynetwork.creativeTab;

import com.PatrikWWDC.electricitynetwork.init.ModItems;
import com.PatrikWWDC.electricitynetwork.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabEN {

    public static final CreativeTabs EN_TAB = new CreativeTabs(Reference.MOD_NAME) {

        @Override
        public Item getTabIconItem() {
            return ModItems.silicon;
        }

        @Override
        public String getTranslatedTabLabel() {
            return "Electricity Network";
        }

    };

}

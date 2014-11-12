package com.PatrikWWDC.nanotech.creativeTab;

import com.PatrikWWDC.nanotech.init.ModItems;
import com.PatrikWWDC.nanotech.reference.Reference;
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

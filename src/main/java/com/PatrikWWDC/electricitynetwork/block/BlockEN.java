package com.PatrikWWDC.electricitynetwork.block;

import com.PatrikWWDC.electricitynetwork.creativeTab.CreativeTabEN;
import com.PatrikWWDC.electricitynetwork.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.block.Block;

public class BlockEN extends Block {

    public BlockEN(Material material) {
        super(material);
        setCreativeTab(CreativeTabEN.EN_TAB);
    }

    public BlockEN() {
        this(Material.rock);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.MOD_ID + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister) {
        blockIcon = iconRegister.registerIcon(this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".") + 1));
    }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }
}

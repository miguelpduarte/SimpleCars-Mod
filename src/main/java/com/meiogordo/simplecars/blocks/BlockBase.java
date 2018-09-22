package com.meiogordo.simplecars.blocks;

import com.meiogordo.simplecars.SimpleCars;
import com.meiogordo.simplecars.init.ModBlocks;
import com.meiogordo.simplecars.init.ModItems;
import com.meiogordo.simplecars.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel {
    public BlockBase(String name, Material mat) {
        super(mat);

        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModBlocks.BLOCKS.add(this);
        ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    @Override
    public void registerModels() {
        SimpleCars.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
    }
}

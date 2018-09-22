package com.meiogordo.simplecars.items;

import com.meiogordo.simplecars.SimpleCars;
import com.meiogordo.simplecars.init.ModItems;
import com.meiogordo.simplecars.util.IHasModel;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

    public ItemBase(String name) {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.TOOLS);

        ModItems.ITEMS.add(this);
    }

    @Override
    public void registerModels() {
        SimpleCars.proxy.registerItemRenderer(this, 0, "inventory");
    }
}

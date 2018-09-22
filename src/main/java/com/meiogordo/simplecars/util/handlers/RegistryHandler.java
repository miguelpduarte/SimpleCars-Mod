package com.meiogordo.simplecars.util.handlers;

import com.meiogordo.simplecars.init.ModBlocks;
import com.meiogordo.simplecars.init.ModItems;
import com.meiogordo.simplecars.util.IHasModel;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {
    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ModItems.ITEMS.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for(Item i : ModItems.ITEMS) {
            if(i instanceof IHasModel) {
                ((IHasModel) i).registerModels();
            }
        }
        for(Block b : ModBlocks.BLOCKS) {
            if(b instanceof IHasModel) {
               ((IHasModel) b).registerModels();
            }
        }
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(ModBlocks.BLOCKS.toArray(new Block[0]));
    }
}

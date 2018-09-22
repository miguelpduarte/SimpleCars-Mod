package com.meiogordo.simplecars.init;

import com.meiogordo.simplecars.blocks.BlockBase;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

import java.util.ArrayList;
import java.util.List;

public class ModBlocks {
    public static final List<Block> BLOCKS = new ArrayList<>();

    public static final Block ENGINE_BLOCK = new BlockBase("engine_block", Material.ANVIL);
}

package net.ayumichizuru.unpushslab.block;

import eu.pb4.polymer.api.block.PolymerBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.piston.PistonBehavior;

public class UnpushableSlab extends SlabBlock implements PolymerBlock {
    public UnpushableSlab(Settings settings) {
        super(settings);
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return Blocks.COBBLED_DEEPSLATE_SLAB;
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return Blocks.COBBLED_DEEPSLATE_SLAB.getDefaultState()
                .with(SlabBlock.TYPE, state.get(SlabBlock.TYPE))
                .with(SlabBlock.WATERLOGGED, state.get(SlabBlock.WATERLOGGED));
    }

    @Override
    public PistonBehavior getPistonBehavior(BlockState state) {
        return PistonBehavior.BLOCK;
    }

}

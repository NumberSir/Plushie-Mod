package com.link.plushies.blocks;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FoxPlushie extends Plushie {
    @Override
    public VoxelShape getShape(BlockState state, BlockGetter p_220053_2_, BlockPos p_220053_3_, CollisionContext p_220053_4_) {
        Direction dir = state.getValue(FACING);
        switch (dir) {
            case NORTH:
                return Shapes.box(0f, 0f, 0.1f, 1f, 0.45f, 0.82f);
            case SOUTH:
                return Shapes.box(0f, 0f, 0.18f, 1f, 0.45f, 0.9f);
            case EAST:
                return Shapes.box(0.18f, 0f, 0f, 0.9f, 0.45f, 1f);
            case WEST:
                return Shapes.box(0.1f, 0f, 0f, 0.82f, 0.45f, 1f);
            default:
                return Shapes.block();
        }
    }
}

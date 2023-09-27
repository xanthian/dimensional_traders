package xanthian.dimensional_traders.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LevelEvent;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.material.Fluids;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class TraderBlock extends Block {

    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final EnumProperty<DoubleBlockHalf> HALF = BlockStateProperties.DOUBLE_BLOCK_HALF;

    public TraderBlock(BlockBehaviour.Properties pProperties) {
        super(pProperties);
        this.registerDefaultState(this.stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(HALF, DoubleBlockHalf.LOWER));
    }

    @Override
    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext pContext) {
        BlockPos blockPos = pContext.getClickedPos();
        Level level = pContext.getLevel();
        if (blockPos.getY() < level.getMaxBuildHeight() - 1 && level.getBlockState(blockPos.above()).canBeReplaced(pContext)) {
            return this.defaultBlockState().setValue(FACING, pContext.getHorizontalDirection().getOpposite()).setValue(HALF, DoubleBlockHalf.LOWER);
        }
        return null;
    }

    @Override
    public void setPlacedBy(Level pLevel, BlockPos pPos, BlockState pState, LivingEntity pPlacer, @NotNull ItemStack pStack) {
        pLevel.setBlock(pPos.above(), pState.setValue(HALF, DoubleBlockHalf.UPPER), 3);
    }

    @Override
    public boolean canSurvive(BlockState pState, LevelReader pLevel, BlockPos pPos) {
        BlockPos blockPos = pPos.below();
        BlockState blockstate = pLevel.getBlockState(blockPos);
        if (pState.getValue(HALF) == DoubleBlockHalf.LOWER) {
            return blockstate.isFaceSturdy(pLevel, blockPos, Direction.UP);
        }
        return blockstate.is(this);
    }

    @Override
    public void playerWillDestroy(Level pLevel, @NotNull BlockPos pPos, @NotNull BlockState pState, @NotNull Player pPlayer) {
        if (!pLevel.isClientSide && pPlayer.isCreative()) {
            TraderBlock.onBreakInCreative(pLevel, pPos, pState, pPlayer);
        }
        super.playerWillDestroy(pLevel, pPos, pState, pPlayer);
    }

    protected static void onBreakInCreative(Level pLevel, BlockPos pPos, BlockState pState, Player pPlayer) {
        BlockPos blockPos;
        BlockState blockState;
        DoubleBlockHalf doubleBlockHalf = pState.getValue(HALF);
        if (doubleBlockHalf == DoubleBlockHalf.UPPER && (blockState = pLevel.getBlockState(blockPos = pPos.below())).is(pState.getBlock()) && blockState.getValue(HALF) == DoubleBlockHalf.LOWER) {
            BlockState blockState2 = blockState.getFluidState().is(Fluids.WATER) ? Blocks.WATER.defaultBlockState() : Blocks.AIR.defaultBlockState();
            pLevel.setBlockAndUpdate(blockPos, blockState2);
            pLevel.levelEvent(pPlayer, LevelEvent.PARTICLES_DESTROY_BLOCK, blockPos, Block.getId(blockState));
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
        pBuilder.add(FACING, HALF);
    }

    @Override
    public @NotNull BlockState updateShape(BlockState pState, Direction pFacing, @NotNull BlockState pFacingState, @NotNull LevelAccessor pLevel, @NotNull BlockPos pCurrentPos, @NotNull BlockPos pFacingPos) {
        DoubleBlockHalf doubleBlockHalf = pState.getValue(HALF);
        if (pFacing.getAxis() == Direction.Axis.Y && doubleBlockHalf == DoubleBlockHalf.LOWER == (pFacing == Direction.UP)) {
            if (pFacingState.is(this) && pFacingState.getValue(HALF) != doubleBlockHalf) {
                return pState.setValue(FACING, pFacingState.getValue(FACING));
            }
            return Blocks.AIR.defaultBlockState();
        }
        if (doubleBlockHalf == DoubleBlockHalf.LOWER && pFacing == Direction.DOWN && !pState.canSurvive(pLevel, pFacingPos)) {
            return Blocks.AIR.defaultBlockState();
        }
        return super.updateShape(pState, pFacing, pFacingState, pLevel, pCurrentPos, pFacingPos);
    }
}
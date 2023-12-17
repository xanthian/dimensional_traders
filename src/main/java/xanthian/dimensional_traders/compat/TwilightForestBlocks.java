package xanthian.dimensional_traders.compat;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.dimensional_traders.Initialise;
import xanthian.dimensional_traders.block.TraderBlock;

import java.util.function.Supplier;

public class TwilightForestBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static final RegistryObject<Block> TWILIGHT_FOREST_TRADER_STALL = registerBlock("twilight_forest_trader_stall",
            () -> new TraderBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return TwilightForestItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
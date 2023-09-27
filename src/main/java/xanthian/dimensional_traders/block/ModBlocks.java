package xanthian.dimensional_traders.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

import xanthian.dimensional_traders.Initialise;
import xanthian.dimensional_traders.item.ModItems;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Initialise.MOD_ID);

    public static final RegistryObject<Block> NETHER_TRADER_STALL = registerBlock("nether_trader_stall",
            () -> new TraderBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).noOcclusion()));
    public static final RegistryObject<Block> END_TRADER_STALL = registerBlock("end_trader_stall",
            () -> new TraderBlock(BlockBehaviour.Properties.copy(Blocks.END_STONE).noOcclusion()));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }
}
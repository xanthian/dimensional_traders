package xanthian.dimensional_traders.block;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import xanthian.dimensional_traders.Initialise;

public class ModBlocks {

    public static final Block NETHER_TRADER_STALL = new TraderBlock(AbstractBlock.Settings.copy(Blocks.BLACKSTONE).nonOpaque());
    public static final Block END_TRADER_STALL = new TraderBlock(AbstractBlock.Settings.copy(Blocks.END_STONE).nonOpaque());


    public static void registerBlocks() {
        registerBlocks("nether_trader_stall", NETHER_TRADER_STALL);
        registerBlocks("end_trader_stall", END_TRADER_STALL);
    }

    private static void registerBlocks(String Id, Block block) {
        Identifier identifier = Identifier.of(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new Item.Settings()));
    }
}
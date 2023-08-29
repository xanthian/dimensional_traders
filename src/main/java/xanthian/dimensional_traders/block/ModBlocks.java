package xanthian.dimensional_traders.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import xanthian.dimensional_traders.Initialise;

public class ModBlocks {

    public static final Block NETHER_TRADER_STALL = new TraderBlock(FabricBlockSettings.copyOf(Blocks.BLACKSTONE).nonOpaque());
    public static final Block END_TRADER_STALL = new TraderBlock(FabricBlockSettings.copyOf(Blocks.END_STONE).nonOpaque());


    public static void registerBlocks() {
        registerBlocks("nether_trader_stall", NETHER_TRADER_STALL);
        registerBlocks("end_trader_stall", END_TRADER_STALL);
    }

    private static void registerBlocks(String Id, Block block) {
        Identifier identifier = new Identifier(Initialise.MOD_ID, Id.toLowerCase());
        Registry.register(Registries.BLOCK, identifier, block);
        Registry.register(Registries.ITEM, identifier, new BlockItem(block, new FabricItemSettings()));
    }
}
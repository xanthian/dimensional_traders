package xanthian.dimensional_traders.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import xanthian.dimensional_traders.block.ModBlocks;

public class LootTableGenerator extends FabricBlockLootTableProvider {
    public LootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.END_TRADER_STALL, doorDrops(ModBlocks.END_TRADER_STALL));
        addDrop(ModBlocks.NETHER_TRADER_STALL, doorDrops(ModBlocks.NETHER_TRADER_STALL));
    }
}

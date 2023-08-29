package xanthian.dimensional_traders.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryWrapper;

import xanthian.dimensional_traders.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.registry.tag.BlockTags.PICKAXE_MINEABLE;

public class BlockTagGenerator  extends FabricTagProvider.BlockTagProvider {
    public BlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {

        getOrCreateTagBuilder(PICKAXE_MINEABLE)
                .add(ModBlocks.END_TRADER_STALL)
                .add(ModBlocks.NETHER_TRADER_STALL);
    }
}

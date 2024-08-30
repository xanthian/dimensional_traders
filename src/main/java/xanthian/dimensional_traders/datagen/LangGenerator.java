package xanthian.dimensional_traders.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;

import net.minecraft.registry.RegistryWrapper;
import xanthian.dimensional_traders.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class LangGenerator  extends FabricLanguageProvider {
    public LangGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup registryLookup, TranslationBuilder translationBuilder) {

        translationBuilder.add(ModBlocks.END_TRADER_STALL, "End Trading Stall");
        translationBuilder.add(ModBlocks.NETHER_TRADER_STALL, "Nether Trading Stall");
    }
}
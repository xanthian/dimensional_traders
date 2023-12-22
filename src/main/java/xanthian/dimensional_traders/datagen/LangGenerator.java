package xanthian.dimensional_traders.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import xanthian.dimensional_traders.block.ModBlocks;
import xanthian.dimensional_traders.entity.ModVillagers;

public class LangGenerator extends FabricLanguageProvider {
    public LangGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {

        translationBuilder.add(ModBlocks.END_TRADER_STALL, "End Trading Stall");
        translationBuilder.add(ModBlocks.NETHER_TRADER_STALL, "Nether Trading Stall");

        translationBuilder.add(ModVillagers.END_TRADER_ID, "End Trader");
        translationBuilder.add(ModVillagers.NETHER_TRADER_ID, "Nether Trader");

    }
}
package xanthian.dimensional_traders;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

import xanthian.dimensional_traders.datagen.*;

public class DataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(PointofInterestTagGenerator::new);
		pack.addProvider(BlockTagGenerator::new);

		pack.addProvider(LangGenerator::new);
		pack.addProvider(LootTableGenerator::new);
		pack.addProvider(RecipeGenerator::new);
	}
}

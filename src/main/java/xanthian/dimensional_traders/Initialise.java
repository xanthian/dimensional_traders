package xanthian.dimensional_traders;

import net.fabricmc.api.ModInitializer;

import xanthian.dimensional_traders.block.ModBlocks;
import xanthian.dimensional_traders.entity.ModVillagers;
import xanthian.dimensional_traders.util.ModCreativeGroup;

public class Initialise implements ModInitializer {

	public static final String MOD_ID = "dimensional_traders";

	@Override
	public void onInitialize() {

		ModBlocks.registerBlocks();
		ModVillagers.registerTrades();
		ModCreativeGroup.registerItemGroup();
	}
}
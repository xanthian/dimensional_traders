package xanthian.dimensional_traders.compat;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import twilightforest.init.TFBlocks;
import twilightforest.init.TFItems;
import xanthian.dimensional_traders.Initialise;

import java.util.List;

@Mod.EventBusSubscriber(modid = Initialise.MOD_ID)
public class TwilightForestEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (ModList.get().isLoaded("twilightforest")) {

            if (event.getType() == TwilightForestVillager.TWILIGHT_FOREST_TRADER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

                // TF TRADER
                // Novice
                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFItems.TORCHBERRIES.get(), 16),
                        new ItemStack(Items.EMERALD, 1), 3, 1, 0.02f));

                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFBlocks.NAGASTONE.get(), 20),
                        new ItemStack(Items.EMERALD, 1), 3, 1, 0.02f));

                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFBlocks.FIDDLEHEAD.get(), 18),
                        new ItemStack(Items.EMERALD, 1), 3, 1, 0.02f));

                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFItems.CICADA.get(), 16),
                        new ItemStack(Items.EMERALD, 1), 3, 1, 0.02f));

                trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5),
                        new ItemStack(TFItems.NAGA_SCALE.get(), 1), 3, 1, 0.02f));

                // Apprentice
                trades.get(2).add(new VillagerTrades.EnchantedItemForEmeralds(TFItems.NAGA_CHESTPLATE.get(),
                        40, 1, 12, 0.06F));

                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.BONE, 15),
                        new ItemStack(Items.EMERALD, 1), 3, 4, 0.02f));

                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 10),
                        new ItemStack(TFItems.MAZE_WAFER.get(), 1), 3, 4, 0.02f));

                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 7),
                        new ItemStack(TFItems.LIVEROOT.get(), 1), 3, 4, 0.02f));

                trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 48),
                        new ItemStack(TFBlocks.IRONWOOD_BLOCK.get(), 1), 3, 4, 0.02f));

                // Journeyman
                trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 48),
                        new ItemStack(TFItems.TWILIGHT_SCEPTER.get(), 1), 1, 12, 0.02f));

                trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFBlocks.MAZESTONE.get(), 1),
                        new ItemStack(Items.EMERALD, 5), 5, 4, 0.02f));

                trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 32),
                        new ItemStack(TFItems.RAVEN_FEATHER.get(), 2), 1, 12, 0.02f));

                trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 32),
                        new ItemStack(TFItems.STEELEAF_INGOT.get(), 4), 3, 4, 0.02f));

                trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFItems.NAGA_SCALE.get(), 10),
                        new ItemStack(TFItems.COOKED_MEEF.get(), 2), 5, 6, 0.02f));

                // Expert
                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 32),
                        new ItemStack(TFItems.ZOMBIE_SCEPTER.get(), 1), 1, 21, 0.02f));

                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(TFItems.FIERY_BLOOD.get(), 6),
                        new ItemStack(Items.EMERALD, 2), 3, 7, 0.02f));

                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 32),
                        new ItemStack(TFItems.KNIGHTMETAL_INGOT.get(), 4), 3, 7, 0.02f));

                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 18),
                        new ItemStack(TFItems.ALPHA_YETI_FUR.get(), 1), 3, 7, 0.02f));

                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 48),
                        new ItemStack(TFItems.MAZE_MAP_FOCUS.get(), 1), 3, 7, 0.02f));

                trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 64),
                        new ItemStack(TFItems.TRIPLE_BOW.get(), 1), 1, 21, 0.02f));

                // Master
                trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 12),
                        new ItemStack(TFItems.CHARM_OF_LIFE_2.get(), 1), 1, 15, 0.02f));

                trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 32),
                        new ItemStack(TFItems.CARMINITE.get(), 3), 3, 15, 0.02f));

                trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 16),
                        new ItemStack(TFItems.PEACOCK_FEATHER_FAN.get(), 1), 1, 15, 0.02f));

                trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 16),
                        new ItemStack(TFItems.ORE_MAGNET.get(), 1), 1, 1, 0.02f));

                trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD_BLOCK, 64),
                        new ItemStack(TFItems.MAZE_MAP.get(), 1), 1, 1, 0.02f));

                trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(new ItemStack(Items.EMERALD, 64),
                        new ItemStack(TFBlocks.FIERY_BLOCK.get(), 1), 3, 1, 0.02f));
            }
        }
    }
}
package xanthian.dimensional_traders.event;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import net.minecraft.world.item.alchemy.Potions;

import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import xanthian.dimensional_traders.Initialise;
import xanthian.dimensional_traders.entity.ModVillagers;
import xanthian.dimensional_traders.util.ModTradeOffers;

import java.util.List;

@Mod.EventBusSubscriber(modid = Initialise.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void addCustomTrades(VillagerTradesEvent event) {
        if (event.getType() == ModVillagers.NETHER_TRADER.get()) {
            Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // NETHER TRADER
            // Novice
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.ROTTEN_FLESH, 32),
                    new ItemStack(Items.EMERALD, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.NETHERRACK, 20),
                    new ItemStack(Items.EMERALD, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.BASALT, 18),
                    new ItemStack(Items.EMERALD, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.BLACKSTONE, 16),
                    new ItemStack(Items.EMERALD, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.MAGMA_CREAM, 3),
                    3, 1, 0.02f));

            // Apprentice
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.SOUL_SAND, 1),
                    3, 4, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.SOUL_SOIL, 1),
                    3, 4, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 10),
                    new ItemStack(Items.BLAZE_POWDER, 1),
                    3, 4, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.SHROOMLIGHT, 1),
                    3, 4, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.MAGMA_BLOCK, 1),
                    3, 4, 0.02f));

            // Journeyman
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.CRIMSON_FUNGUS, 5),
                    3, 4, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.BROWN_MUSHROOM, 2),
                    3, 4, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.WARPED_FUNGUS, 5),
                    3, 4, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 32),
                    new ItemStack(Items.RED_NETHER_BRICKS, 10),
                    3, 4, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.QUARTZ, 5),
                    5, 6, 0.02f));

            // Expert
            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 48),
                    new ItemStack(Items.GHAST_TEAR, 1),
                    3, 7, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.BONE_BLOCK, 1),
                    3, 7, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.CRYING_OBSIDIAN, 1),
                    3, 7, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.NETHER_WART_BLOCK, 1),
                    3, 7, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.WARPED_WART_BLOCK, 1),
                    3, 7, 0.02f));

            // Master
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 12),
                    new ItemStack(Items.ANCIENT_DEBRIS, 1),
                    1, 15, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD_BLOCK, 6),
                    new ItemStack(Items.WITHER_SKELETON_SKULL, 1),
                    1, 15, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 12),
                    new ItemStack(Items.GILDED_BLACKSTONE, 3),
                    5, 1, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 16),
                    new ItemStack(Items.BLAZE_ROD, 1),
                    5, 1, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 64),
                    new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 1),
                    1, 1, 0.02f));
        }

        if (event.getType() == ModVillagers.END_TRADER.get()) {
                Int2ObjectMap<List<VillagerTrades.ItemListing>> trades = event.getTrades();

            // Novice
            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.END_STONE, 20),
                    new ItemStack(Items.EMERALD, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.OBSIDIAN, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.CHORUS_FRUIT, 5),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.OBSIDIAN, 5),
                    new ItemStack(Items.EMERALD, 1),
                    3, 1, 0.02f));

            trades.get(1).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.IRON_BARS, 5),
                    3, 1, 0.02f));

            // Apprentice
            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.MAGENTA_STAINED_GLASS, 2),
                    3, 4, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new ModTradeOffers.SellPotionsFactory(
                    Potions.STRONG_HEALING, 5,4,0.02f).getOffer(pTrader, pRandom));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 3),
                    new ItemStack(Items.END_ROD, 1),
                    3, 4, 0.02f));

            trades.get(2).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.ENDER_EYE, 1),
                    new ItemStack(Items.EMERALD, 1),
                    3, 4, 0.02f));

            // Journeyman
            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.DIAMOND, 1),
                    3, 9, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.END_STONE_BRICKS, 5),
                    5, 9, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(Items.POPPED_CHORUS_FRUIT, 5),
                    3, 9, 0.02f));

            trades.get(3).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.ENDER_PEARL, 1),
                    7, 10, 0.02f));

            // Expert
            trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_SWORD,
                    40, 1, 28, 0.2F));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.CHORUS_FLOWER, 1),
                    5, 14, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 5),
                    new ItemStack(Items.DRAGON_BREATH, 1),
                    5, 14, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.EMERALD, 1),
                    new ItemStack(Items.PURPUR_PILLAR, 1),
                    5, 14, 0.02f));

            trades.get(4).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.ENDER_CHEST, 1),
                    new ItemStack(Items.EMERALD, 48),
                    3, 14, 0.02f));

            trades.get(4).add(new VillagerTrades.EnchantedItemForEmeralds(Items.DIAMOND_CHESTPLATE,
                    48, 1, 28, 0.2F));

            // Master
            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.ELYTRA, 1),
                    new ItemStack(Items.EMERALD_BLOCK, 64),
                    1, 1, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.END_CRYSTAL, 1),
                    new ItemStack(Items.EMERALD, 32),
                    3, 1, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.PURPUR_BLOCK, 32),
                    new ItemStack(Items.EMERALD, 50),
                    5, 1, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.SHULKER_BOX, 1),
                    new ItemStack(Items.EMERALD_BLOCK, 32),
                    1, 1, 0.02f));

            trades.get(5).add((pTrader, pRandom) -> new MerchantOffer(
                    new ItemStack(Items.SHULKER_SHELL, 1),
                    new ItemStack(Items.EMERALD, 64),
                    1, 1, 0.02f));
        }
    }
}
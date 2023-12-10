package xanthian.dimensional_traders.entity;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potions;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import xanthian.dimensional_traders.Initialise;
import xanthian.dimensional_traders.block.ModBlocks;
import xanthian.dimensional_traders.util.ModTradeOffers;

public class ModVillagers {

    public static final Identifier NETHER_TRADER_ID = new Identifier(Initialise.MOD_ID, "nether_trader");

    public static final PointOfInterestType NETHER_TRADER_POI = PointOfInterestHelper.register(
            NETHER_TRADER_ID, 1, 1, ModBlocks.NETHER_TRADER_STALL
    );

    public static final Identifier END_TRADER_ID = new Identifier(Initialise.MOD_ID, "end_trader");

    public static final PointOfInterestType END_TRADER_POI = PointOfInterestHelper.register(
            END_TRADER_ID, 1, 1, ModBlocks.END_TRADER_STALL
    );


    public static final VillagerProfession NETHER_TRADER_PROFESSION = Registry.register(Registries.VILLAGER_PROFESSION, NETHER_TRADER_ID,
            VillagerProfessionBuilder.create()
                    .id(NETHER_TRADER_ID)
                    .workstation(RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, NETHER_TRADER_ID))
                    .workSound(SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH)
                    .build()
    );

    public static final VillagerProfession END_TRADER_PROFESSION = Registry.register(Registries.VILLAGER_PROFESSION, END_TRADER_ID,
            VillagerProfessionBuilder.create()
                    .id(END_TRADER_ID)
                    .workstation(RegistryKey.of(RegistryKeys.POINT_OF_INTEREST_TYPE, END_TRADER_ID))
                    .workSound(SoundEvents.ENTITY_VILLAGER_WORK_TOOLSMITH)
                    .build()
    );

    private ModVillagers() {/* No instantiation. */}

    public static void registerTrades() {

        // NETHER TRADER
        // Novice
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            // Buy
                            new ItemStack(Items.ROTTEN_FLESH, 32),
                            // Sell
                            new ItemStack(Items.EMERALD, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            // Buy
                            new ItemStack(Items.NETHERRACK, 20),
                            // Sell
                            new ItemStack(Items.EMERALD, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BASALT, 18),
                            new ItemStack(Items.EMERALD, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.BLACKSTONE, 16),
                            new ItemStack(Items.EMERALD, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.MAGMA_CREAM, 3),
                            3, 1, 0.02f
                    )));
                });

        // Apprentice
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.SOUL_SAND, 1),
                            3, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.SOUL_SOIL, 1),
                            3, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 10),
                            new ItemStack(Items.BLAZE_POWDER, 1),
                            3, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.SHROOMLIGHT, 1),
                            3, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.MAGMA_BLOCK, 1),
                            3, 4, 0.02f
                    )));
                });

        // Journeyman
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.CRIMSON_FUNGUS, 5),
                            3, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BROWN_MUSHROOM, 2),
                            3, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.WARPED_FUNGUS, 5),
                            3, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(Items.RED_NETHER_BRICKS, 10),
                            3, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.QUARTZ, 5),
                            5, 8, 0.02f
                    )));
                });

        // Expert
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(Items.GHAST_TEAR, 1),
                            3, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.BONE_BLOCK, 1),
                            3, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.CRYING_OBSIDIAN, 1),
                            3, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.NETHER_WART_BLOCK, 1),
                            3, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.WARPED_WART_BLOCK, 1),
                            3, 14, 0.02f
                    )));
                });

        // Master
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 12),
                            new ItemStack(Items.ANCIENT_DEBRIS, 1),
                            1, 15, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 6),
                            new ItemStack(Items.WITHER_SKELETON_SKULL, 1),
                            1, 15, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 12),
                            new ItemStack(Items.GILDED_BLACKSTONE, 3),
                            5, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(Items.BLAZE_ROD, 1),
                            5, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(NETHER_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE, 1),
                            1, 1, 0.02f
                    )));
                });

        // END TRADER
        // Novice
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            // Buy
                            new ItemStack(Items.END_STONE, 20),
                            // Sell
                            new ItemStack(Items.EMERALD, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.OBSIDIAN, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.CHORUS_FRUIT, 5),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.OBSIDIAN, 5),
                            new ItemStack(Items.EMERALD, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.IRON_BARS, 5),
                            3, 1, 0.02f
                    )));
                });

        // Apprentice
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.MAGENTA_STAINED_GLASS, 2),
                            3, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new ModTradeOffers.SellPotionsFactory(
                            Potions.STRONG_HEALING, 5, 4, 0.02f).create(entity, random)));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 3),
                            new ItemStack(Items.END_ROD, 1),
                            3, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.ENDER_EYE, 1),
                            new ItemStack(Items.EMERALD, 1),
                            3, 4, 0.02f
                    )));
                });

        // Journeyman
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.DIAMOND, 1),
                            3, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.END_STONE_BRICKS, 5),
                            5, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 2),
                            new ItemStack(Items.POPPED_CHORUS_FRUIT, 5),
                            3, 9, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.ENDER_PEARL, 1),
                            7, 10, 0.02f
                    )));
                });

        // Expert
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 4, factories -> {
            factories.add(((entity, random) -> new TradeOffers.SellEnchantedToolFactory(
                    Items.DIAMOND_SWORD, 40, 1, 28, 0.2F).create(entity, random)
            ));
        });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.CHORUS_FLOWER, 1),
                            5, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(Items.DRAGON_BREATH, 1),
                            5, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.PURPUR_PILLAR, 1),
                            5, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(Items.ENDER_CHEST, 1),
                            3, 14, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 4, factories -> {
            factories.add(((entity, random) -> new TradeOffers.SellEnchantedToolFactory(
                    Items.DIAMOND_CHESTPLATE, 48, 1, 28, 0.2F).create(entity, random)
            ));
        });

        // Master
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 64),
                            new ItemStack(Items.ELYTRA, 1),
                            1, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(Items.END_CRYSTAL, 1),
                            3, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 50),
                            new ItemStack(Items.PURPUR_BLOCK, 32),
                            5, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD_BLOCK, 32),
                            new ItemStack(Items.SHULKER_BOX, 1),
                            1, 1, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(END_TRADER_PROFESSION, 5,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 64),
                            new ItemStack(Items.SHULKER_SHELL, 1),
                            1, 1, 0.02f
                    )));
                });
    }
}

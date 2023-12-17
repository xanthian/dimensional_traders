package xanthian.dimensional_traders;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xanthian.dimensional_traders.block.ModBlocks;
import xanthian.dimensional_traders.compat.TwilightForestBlocks;
import xanthian.dimensional_traders.compat.TwilightForestItems;
import xanthian.dimensional_traders.compat.TwilightForestVillager;
import xanthian.dimensional_traders.entity.ModVillagers;
import xanthian.dimensional_traders.item.ModItems;


@Mod(Initialise.MOD_ID)
public class Initialise {

    public static final String MOD_ID = "dimensional_traders";

    public Initialise() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::addCreative);

        ModBlocks.BLOCKS.register(modEventBus);
        ModItems.ITEMS.register(modEventBus);
        ModVillagers.POI_TYPES.register(modEventBus);
        ModVillagers.VILLAGER_PROFESSIONS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        if (ModList.get().isLoaded("twilightforest")) {
            TwilightForestBlocks.BLOCKS.register(modEventBus);
            TwilightForestItems.ITEMS.register(modEventBus);
            TwilightForestVillager.POI_TYPES.register(modEventBus);
            TwilightForestVillager.VILLAGER_PROFESSIONS.register(modEventBus);

        }
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {

    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
        }
    }
}
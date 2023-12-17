package xanthian.dimensional_traders.compat;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.dimensional_traders.Initialise;

public class TwilightForestVillager {

    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Initialise.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Initialise.MOD_ID);

    public static final RegistryObject<PoiType> TWILIGHT_FOREST_TRADER_POI = POI_TYPES.register("twilight_forest_trader_stall",
            () -> new PoiType(ImmutableSet.copyOf(TwilightForestBlocks.TWILIGHT_FOREST_TRADER_STALL.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> TWILIGHT_FOREST_TRADER =
            VILLAGER_PROFESSIONS.register("twilight_forest_trader", () -> new VillagerProfession("twilight_forest_trader",
                    holder -> holder.get() == TWILIGHT_FOREST_TRADER_POI.get(), holder -> holder.get() == TWILIGHT_FOREST_TRADER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));


}

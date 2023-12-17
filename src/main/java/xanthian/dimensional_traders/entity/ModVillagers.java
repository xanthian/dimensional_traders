package xanthian.dimensional_traders.entity;

import com.google.common.collect.ImmutableSet;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.ai.village.poi.PoiType;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import xanthian.dimensional_traders.Initialise;
import xanthian.dimensional_traders.block.ModBlocks;

public class ModVillagers {

    public static final DeferredRegister<PoiType> POI_TYPES =
            DeferredRegister.create(ForgeRegistries.POI_TYPES, Initialise.MOD_ID);
    public static final DeferredRegister<VillagerProfession> VILLAGER_PROFESSIONS =
            DeferredRegister.create(ForgeRegistries.VILLAGER_PROFESSIONS, Initialise.MOD_ID);

    public static final RegistryObject<PoiType> NETHER_TRADER_POI = POI_TYPES.register("nether_trader_stall",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.NETHER_TRADER_STALL.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> NETHER_TRADER =
            VILLAGER_PROFESSIONS.register("nether_trader", () -> new VillagerProfession("nether_trader",
                    holder -> holder.get() == NETHER_TRADER_POI.get(), holder -> holder.get() == NETHER_TRADER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));


    public static final RegistryObject<PoiType> END_TRADER_POI = POI_TYPES.register("end_trader_stall",
            () -> new PoiType(ImmutableSet.copyOf(ModBlocks.END_TRADER_STALL.get().getStateDefinition().getPossibleStates()),
                    1, 1));

    public static final RegistryObject<VillagerProfession> END_TRADER =
            VILLAGER_PROFESSIONS.register("end_trader", () -> new VillagerProfession("end_trader",
                    holder -> holder.get() == END_TRADER_POI.get(), holder -> holder.get() == END_TRADER_POI.get(),
                    ImmutableSet.of(), ImmutableSet.of(), SoundEvents.VILLAGER_WORK_TOOLSMITH));

}
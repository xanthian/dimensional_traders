package xanthian.dimensional_traders.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.PointOfInterestTypeTags;
import net.minecraft.world.poi.PointOfInterestType;

import xanthian.dimensional_traders.entity.ModVillagers;

import java.util.concurrent.CompletableFuture;

public class PointofInterestTagGenerator extends FabricTagProvider<PointOfInterestType> {
    public PointofInterestTagGenerator(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(dataOutput, RegistryKeys.POINT_OF_INTEREST_TYPE, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(PointOfInterestTypeTags.ACQUIRABLE_JOB_SITE)
                .add(ModVillagers.END_TRADER_POI)
                .add(ModVillagers.NETHER_TRADER_POI);
    }
}

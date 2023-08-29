package xanthian.dimensional_traders.util;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import xanthian.dimensional_traders.Initialise;
import xanthian.dimensional_traders.block.ModBlocks;

public class ModCreativeGroup {

    public static final ItemGroup ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Initialise.MOD_ID, "dimensional_traders"),

            FabricItemGroup.builder()
                    .displayName(Text.translatable("Dimensional Traders"))
                    .icon(() -> new ItemStack(Blocks.EMERALD_BLOCK))
                    .entries((context, entries) -> {

                        entries.add(ModBlocks.END_TRADER_STALL);
                        entries.add(ModBlocks.NETHER_TRADER_STALL);
                    })
                    .build());

    public static void registerItemGroup() {
    }
}
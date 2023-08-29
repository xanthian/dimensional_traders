package xanthian.dimensional_traders.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;

import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import xanthian.dimensional_traders.block.ModBlocks;

import java.util.function.Consumer;

public class RecipeGenerator extends FabricRecipeProvider {
    public RecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {

        offerTraderStationRecipe(exporter,ModBlocks.END_TRADER_STALL, Blocks.END_STONE, Blocks.OBSIDIAN, Blocks.MAGENTA_CARPET);
        offerTraderStationRecipe(exporter,ModBlocks.NETHER_TRADER_STALL, Blocks.NETHERRACK, Blocks.BLACKSTONE, Blocks.CYAN_CARPET);
    }

        public static void offerTraderStationRecipe(Consumer<RecipeJsonProvider> exporter, ItemConvertible station, ItemConvertible baseblock, ItemConvertible topblock,ItemConvertible roof) {
            ShapedRecipeJsonBuilder.create(RecipeCategory.DECORATIONS, station, 1)
                    .input('B', baseblock).input('T', topblock).input('R', roof).input('E', Items.EMERALD)
                    .pattern(" R ").pattern("ETE").pattern("BBB")
                    .criterion("has_base_block", VanillaRecipeProvider.conditionsFromItem(baseblock)).criterion("has_top_slab", VanillaRecipeProvider.conditionsFromItem(topblock))
                    .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(station)));
    }
}
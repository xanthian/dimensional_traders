package xanthian.dimensional_traders.util;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.npc.VillagerTrades;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionUtils;
import net.minecraft.world.item.trading.MerchantOffer;
import org.jetbrains.annotations.NotNull;

public class ModTradeOffers extends VillagerTrades {

    public static class SellPotionsFactory
            implements VillagerTrades.ItemListing {
        final Potion potion;
        final int merchantExperience;
        final int maxUses;
        final float priceMultiplier;

        public SellPotionsFactory(Potion potion, int maxUses, int merchantExperience, float priceMultiplier) {
            this.potion = potion;
            this.maxUses = maxUses;
            this.merchantExperience = merchantExperience;
            this.priceMultiplier = priceMultiplier;
        }

        @Override
        public MerchantOffer getOffer(@NotNull Entity pTrader, @NotNull RandomSource pRandom) {
            ItemStack itemStack = new ItemStack(Items.POTION, 1);
            PotionUtils.setPotion(itemStack, this.potion);
            return new MerchantOffer(new ItemStack(Items.EMERALD, 10), itemStack, this.maxUses, this.merchantExperience, this.priceMultiplier);
        }
    }
}
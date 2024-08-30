package xanthian.dimensional_traders.util;

import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.Potions;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;

import net.minecraft.village.TradedItem;
import org.jetbrains.annotations.Nullable;

public class ModTradeOffers extends TradeOffers {

    public static class SellPotionsFactory
            implements Factory {
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
        @Nullable
        public TradeOffer create(Entity entity, Random random) {
            ItemStack itemStack = new ItemStack(Items.POTION, 1);
            PotionContentsComponent.createStack(Items.POTION, Potions.STRONG_HEALING);
            return new TradeOffer(new TradedItem(Items.EMERALD, 10), itemStack, this.maxUses, this.merchantExperience, this.priceMultiplier);
        }
    }
}

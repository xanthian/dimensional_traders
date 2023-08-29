package xanthian.dimensional_traders.util;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionUtil;
import net.minecraft.util.math.random.Random;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.TradeOffers;

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
            PotionUtil.setPotion(itemStack, this.potion);
            return new TradeOffer(new ItemStack(Items.EMERALD, 10), itemStack, this.maxUses, this.merchantExperience, this.priceMultiplier);
        }
    }
}

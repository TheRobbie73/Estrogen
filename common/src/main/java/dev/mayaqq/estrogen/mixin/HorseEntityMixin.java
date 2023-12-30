package dev.mayaqq.estrogen.mixin;

import dev.mayaqq.estrogen.registry.common.EstrogenItems;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.animal.horse.Horse;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BottleItem;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Horse.class)
public class HorseEntityMixin {
    @Inject(at = @At("HEAD"), method = "mobInteract", cancellable = true)
    public void estrogen$interactMob(Player player, InteractionHand hand, CallbackInfoReturnable<InteractionResult> cir) {
        ItemStack stack = player.getItemInHand(hand);
        boolean isntBaby = !((Horse) (Object) this).isBaby();
        if (stack.getItem() instanceof BottleItem && isntBaby) {
            stack.shrink(1);
            player.playSound(SoundEvents.BOTTLE_FILL);
            player.getInventory().placeItemBackInInventory(new ItemStack(EstrogenItems.HORSE_URINE_BOTTLE));
            cir.setReturnValue(InteractionResult.SUCCESS);
        }
    }
}
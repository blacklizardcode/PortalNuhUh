package portalnuhuh.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.EnderEyeItem;
import net.minecraft.world.item.context.UseOnContext;
import portalnuhuh.GameRules;



@Mixin(EnderEyeItem.class)
public class EndPortalMixin {
    @Inject(method="useOn", at = @At("HEAD"), cancellable=true)
    private void disableFillEndPortal(final UseOnContext context, CallbackInfoReturnable<InteractionResult> cir) {
        if (context.getLevel() instanceof ServerLevel serverLevel) {
            boolean enableEndPortal = serverLevel.getGameRules().get(GameRules.enableEndPortal);
            if (!enableEndPortal) {
                cir.setReturnValue(InteractionResult.PASS);
            }
        }
    }

}

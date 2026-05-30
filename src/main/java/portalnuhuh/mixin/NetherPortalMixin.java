package portalnuhuh.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.portal.PortalShape;
import portalnuhuh.GameRules;

@Mixin(PortalShape.class)
public class NetherPortalMixin {
    @Inject(method = "createPortalBlocks", at = @At("HEAD"), cancellable = true)
    private void disableCreatePortalBlocks(final LevelAccessor level, CallbackInfo ci) {
        if (level instanceof ServerLevel serverLevel) {
            boolean enableNetherPortal = serverLevel.getGameRules().get(GameRules.enableNetherPortal);
            if (!enableNetherPortal) {
                ci.cancel();
            }
        }
    }
}
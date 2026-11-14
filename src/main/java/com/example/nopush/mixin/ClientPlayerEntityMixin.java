package com.example.nopush.mixin;

import com.example.nopush.NoPushClient;
import net.minecraft.client.network.ClientPlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public abstract class ClientPlayerEntityMixin {

    // Yarn: ClientPlayerEntity#pushOutOfBlocks(double x, double z)
    // Called every tick to shove the player out of solid blocks they are inside.
    @Inject(method = "pushOutOfBlocks", at = @At("HEAD"), cancellable = true)
    private void nopush$cancelPushOutOfBlocks(double x, double z, CallbackInfo ci) {
        if (NoPushClient.enabled) {
            ci.cancel();
        }
    }
}

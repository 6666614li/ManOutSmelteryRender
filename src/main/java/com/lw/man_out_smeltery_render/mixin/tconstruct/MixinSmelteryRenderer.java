package com.lw.man_out_smeltery_render.mixin.tconstruct;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import slimeknights.tconstruct.smeltery.client.SmelteryRenderer;
import slimeknights.tconstruct.smeltery.tileentity.TileSmeltery;


@Mixin(value = SmelteryRenderer.class, remap = false)
public abstract class MixinSmelteryRenderer {
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void onRender(TileSmeltery smeltery, double x, double y, double z, float partialTicks, int destroyStage, float alpha, CallbackInfo ci) {
        ci.cancel();
    }
}



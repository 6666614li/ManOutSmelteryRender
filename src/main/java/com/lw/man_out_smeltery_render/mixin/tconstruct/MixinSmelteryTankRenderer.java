package com.lw.man_out_smeltery_render.mixin.tconstruct;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import slimeknights.tconstruct.smeltery.client.SmelteryTankRenderer;

@Mixin(value = SmelteryTankRenderer.class, remap = false)
public abstract class MixinSmelteryTankRenderer {

    @Inject(
            method = "renderFluids(Lslimeknights/tconstruct/library/smeltery/SmelteryTank;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;DDD)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void disableRenderFluids_1(CallbackInfo ci) {
            ci.cancel();
    }

    @Inject(
            method = "renderFluids(Lslimeknights/tconstruct/library/smeltery/SmelteryTank;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/math/BlockPos;DDDFLnet/minecraft/util/math/BlockPos;)V",
            at = @At("HEAD"),
            cancellable = true
    )
    private void disableRenderFluids_2(CallbackInfo ci) {
            ci.cancel();
    }

}
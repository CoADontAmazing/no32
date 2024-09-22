package net.coamazing.no32.mixin;

import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
	@Inject(method = "is64Bit", at = @At("RETURN"), cancellable = true)
	protected void is64Bit(CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(true);
	}	
}

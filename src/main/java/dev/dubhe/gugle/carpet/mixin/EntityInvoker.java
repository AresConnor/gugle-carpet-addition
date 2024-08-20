package dev.dubhe.gugle.carpet.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import net.minecraft.world.entity.Entity;

@Mixin({Entity.class})
public interface EntityInvoker {
    @Invoker("unsetRemoved")
    void unsetRemoved();
}

package dev.dubhe.gugle.carpet.mixin;

import java.util.Optional;
import java.util.concurrent.CompletableFuture;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.gen.Invoker;

import com.mojang.authlib.GameProfile;

import carpet.patches.EntityPlayerMPFake;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ClientInformation;
import net.minecraft.server.level.ServerLevel;

@Mixin(EntityPlayerMPFake.class)
public interface EntityPlayerMPFakeInvoker {
    @Invoker(
        value = "fetchGameProfile",
        remap = false
    )
    static CompletableFuture<Optional<GameProfile>> invokeFetchGameProfile(String name) {
        throw new AssertionError();
    }

    @Invoker(
            value = "<init>",
            remap = false
    )
    static EntityPlayerMPFake create(MinecraftServer server, ServerLevel worldIn, GameProfile profile, ClientInformation cli, boolean shadow) {
        throw new AssertionError();
    }
}
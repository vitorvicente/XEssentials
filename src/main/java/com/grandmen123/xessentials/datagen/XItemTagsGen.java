package com.grandmen123.xessentials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class XItemTagsGen extends FabricTagProvider.ItemTagProvider {
    public XItemTagsGen(@NotNull final FabricDataOutput output,
                        @NotNull final CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(@NotNull final RegistryWrapper.WrapperLookup arg) {

    }
}

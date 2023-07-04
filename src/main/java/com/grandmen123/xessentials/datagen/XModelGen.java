package com.grandmen123.xessentials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import org.jetbrains.annotations.NotNull;

public class XModelGen extends FabricModelProvider {
    public XModelGen(@NotNull final FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(@NotNull final BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(@NotNull final ItemModelGenerator itemModelGenerator) {

    }
}

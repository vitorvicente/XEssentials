package com.grandmen123.xessentials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class XRecipeGen extends FabricRecipeProvider {

    public XRecipeGen(@NotNull final FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(@NotNull final Consumer<RecipeJsonProvider> exporter) {

    }
}

package com.grandmen123.xessentials.lib.objects;

import net.minecraft.data.server.recipe.RecipeJsonProvider;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public interface IHasRecipe {
    void generateRecipe(@NotNull final Consumer<RecipeJsonProvider> exporter);
}

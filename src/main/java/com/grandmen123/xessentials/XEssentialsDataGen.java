package com.grandmen123.xessentials;

import com.grandmen123.xessentials.datagen.*;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.jetbrains.annotations.NotNull;

public class XEssentialsDataGen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(@NotNull final FabricDataGenerator fabricDataGenerator) {
		final FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(XBlockTagsGen::new);
		pack.addProvider(XItemTagsGen::new);
		pack.addProvider(XLangGen::new);
		pack.addProvider(XLootTableGen::new);
		pack.addProvider(XModelGen::new);
		pack.addProvider(XRecipeGen::new);
	}
}

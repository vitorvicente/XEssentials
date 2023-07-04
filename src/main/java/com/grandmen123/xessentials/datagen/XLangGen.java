package com.grandmen123.xessentials.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import org.jetbrains.annotations.NotNull;

public class XLangGen extends FabricLanguageProvider {
    public XLangGen(@NotNull final FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generateTranslations(@NotNull final TranslationBuilder translationBuilder) {

    }
}

package com.grandmen123.xessentials.lib.objects;

import com.grandmen123.xessentials.lib.enums.LangCode;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public abstract class XItem extends Item implements IXObject {
    @NotNull
    private final String id;
    @NotNull
    private final Map<LangCode, String> translations;

    public XItem(@NotNull final String id, @NotNull final Map<LangCode, String> translations,
                 @NotNull final Settings settings) {
        super(settings);
        this.id = id;
        this.translations = Map.copyOf(translations);
    }

    public abstract void generateItemModels(@NotNull final ItemModelGenerator itemModelGenerator);

    @Override
    public @NotNull String getId() {
        return this.id;
    }

    @Override
    public @NotNull String getTranslation(@NotNull LangCode langCode) {
        return this.translations.getOrDefault(langCode, this.translations.get(LangCode.EN_US));
    }
}

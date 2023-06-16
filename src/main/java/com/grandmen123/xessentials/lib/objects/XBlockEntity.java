package com.grandmen123.xessentials.lib.objects;

import com.grandmen123.xessentials.lib.enums.LangCode;
import net.minecraft.block.BlockState;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.math.BlockPos;
import org.jetbrains.annotations.NotNull;

import java.util.Map;

public abstract class XBlockEntity extends BlockEntity implements IXObject {
    @NotNull
    private final String id;
    @NotNull
    private final Map<LangCode, String> translations;

    public XBlockEntity(@NotNull final String id, @NotNull final Map<LangCode, String> translations,
                        @NotNull final BlockEntityType<?> type, @NotNull final BlockPos pos,
                        @NotNull final BlockState state) {
        super(type, pos, state);
        this.id = id;
        this.translations = translations;
    }

    @Override
    public @NotNull String getId() {
        return this.id;
    }

    @Override
    public @NotNull String getTranslation(@NotNull LangCode langCode) {
        return this.translations.getOrDefault(langCode, this.translations.get(LangCode.EN_US));
    }
}

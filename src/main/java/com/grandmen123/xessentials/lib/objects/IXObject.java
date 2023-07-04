package com.grandmen123.xessentials.lib.objects;

import com.grandmen123.xessentials.lib.enums.LangCode;
import org.jetbrains.annotations.NotNull;

public interface IXObject {
    @NotNull
    String getId();

    @NotNull
    String getTranslation(@NotNull final LangCode langCode);
}

package com.grandmen123.xessentials.lib.modules;

import com.grandmen123.xessentials.lib.enums.ModuleLoadStatus;
import org.jetbrains.annotations.NotNull;

public abstract class AModule {

    @NotNull
    private final String id;
    private final int loadPriority;

    public AModule(@NotNull final String id, final int loadPriority) {
        this.id = id;
        this.loadPriority = loadPriority;
    }

    @NotNull
    public abstract ModuleLoadStatus loadModule();

    @NotNull
    public String getId() {
        return id;
    }

    public int getLoadPriority() {
        return loadPriority;
    }
}

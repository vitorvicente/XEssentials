package com.grandmen123.xessentials.lib.modules;

import com.grandmen123.xessentials.lib.enums.ModuleLoadStatus;
import org.jetbrains.annotations.NotNull;

public abstract class XModule implements Comparable<XModule> {

    @NotNull
    private final String id;
    @NotNull
    private final Integer loadPriority;

    public XModule(@NotNull final String id, @NotNull final Integer loadPriority) {
        this.id = id;
        this.loadPriority = loadPriority;
    }

    @NotNull
    public abstract ModuleLoadStatus initModule();

    @NotNull
    public String getId() {
        return id;
    }

    @NotNull
    public Integer getLoadPriority() {
        return loadPriority;
    }

    @Override
    public int compareTo(@NotNull XModule o) {
        return this.getLoadPriority() - o.getLoadPriority();
    }
}

package com.grandmen123.xessentials.lib.modules;

import net.minecraft.block.entity.BlockEntity;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface IModuleWBlockEntities {
    @NotNull
    List<BlockEntity> getModuleBlockEntities();
}

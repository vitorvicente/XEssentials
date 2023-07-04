package com.grandmen123.xessentials.xchests;

import com.grandmen123.xessentials.lib.enums.ModuleLoadStatus;
import com.grandmen123.xessentials.lib.modules.IModuleWBlockEntities;
import com.grandmen123.xessentials.lib.modules.IModuleWBlocks;
import com.grandmen123.xessentials.lib.modules.IModuleWItems;
import com.grandmen123.xessentials.lib.modules.XModule;
import com.grandmen123.xessentials.util.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.item.Item;
import org.jetbrains.annotations.NotNull;

import java.util.List;

import static com.grandmen123.xessentials.XEssentials.LOGGER;

public class XChests extends XModule implements IModuleWItems, IModuleWBlocks, IModuleWBlockEntities {

    @NotNull
    private final List<Item> items;
    @NotNull
    private final List<Block> blocks;
    @NotNull
    private final List<BlockEntity> blockEntities;

    public XChests() {
        super(Constants.XCHESTS_MOD_ID, Constants.XCHEST_MOD_PRIORITY);
        this.blocks = List.of();
        this.blockEntities = List.of();
        this.items = List.of();
    }

    @Override
    @NotNull
    public ModuleLoadStatus initModule() {
        LOGGER.info(Constants.LOG_LOADING_MODULE, Constants.XCHESTS_MOD_ID);

        final ModuleLoadStatus itemStatus = registerItems();
        final ModuleLoadStatus blockStatus = registerBlocks();
        final ModuleLoadStatus blockEntityStatus = registerBlockEntities();

        return (blockStatus == ModuleLoadStatus.LOADED
                && blockEntityStatus == ModuleLoadStatus.LOADED
                && itemStatus == ModuleLoadStatus.LOADED) ?
               ModuleLoadStatus.LOADED : ModuleLoadStatus.ERRORED;
    }

    @Override
    @NotNull
    public List<Item> getModuleItems() {
        return this.items;
    }

    @Override
    @NotNull
    public List<Block> getModuleBlocks() {
        return this.blocks;
    }

    @Override
    @NotNull
    public List<BlockEntity> getModuleBlockEntities() {
        return this.blockEntities;
    }

    private ModuleLoadStatus registerItems() {
        return ModuleLoadStatus.LOADED;
    }

    private ModuleLoadStatus registerBlocks() {
        return ModuleLoadStatus.LOADED;
    }

    private ModuleLoadStatus registerBlockEntities() {
        return ModuleLoadStatus.LOADED;
    }

}

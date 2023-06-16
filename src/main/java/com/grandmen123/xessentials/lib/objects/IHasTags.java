package com.grandmen123.xessentials.lib.objects;

import net.minecraft.registry.tag.TagKey;

import java.util.List;

public interface IHasTags<T> {
    List<TagKey<T>> getTags();
}

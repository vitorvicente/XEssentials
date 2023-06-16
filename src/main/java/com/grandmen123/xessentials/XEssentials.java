package com.grandmen123.xessentials;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XEssentials implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("xessentials");

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}
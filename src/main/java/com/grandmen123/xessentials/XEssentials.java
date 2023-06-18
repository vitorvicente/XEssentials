package com.grandmen123.xessentials;

import com.grandmen123.xessentials.lib.modules.XModule;
import com.grandmen123.xessentials.util.Constants;
import net.fabricmc.api.ModInitializer;

import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collections;
import java.util.List;

public class XEssentials implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger(Constants.ID_CAPS);
    public static final String MOD_ID = Constants.ID_DEFAULT;

	@NotNull
    private List<XModule> modules = List.of();

    @Override
    public void onInitialize() {
        this.initModules();
    }

	@NotNull
	public List<XModule> getModules() {
		return this.modules;
	}


    private void initModules() {
		LOGGER.info(Constants.LOG_LOADING_MODULES);
        XModule xChests;
        XModule xFurnaces;
        XModule xEnder;
        XModule xCompress;
        XModule xXP;
        XModule xLights;
        XModule xMobs;
        XModule xBuild;
        XModule xTPUtils;
        XModule xMisc;

        List<XModule> uninitialized = new java.util.ArrayList<>(List.of());
		Collections.sort(uninitialized);

		for (XModule mod : uninitialized) {
			mod.initModule();
			this.modules.add(mod);
		}
    }
}
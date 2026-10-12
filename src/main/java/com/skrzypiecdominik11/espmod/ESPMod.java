package com.skrzypiecdominik11.espmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ESPMod implements ModInitializer {
    public static final String MOD_ID = "espmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing ESP Mod");
        // Initialize mod components here
    }
}
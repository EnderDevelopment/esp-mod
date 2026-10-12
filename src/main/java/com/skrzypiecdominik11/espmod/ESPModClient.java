package com.skrzypiecdominik11.espmod;

import net.fabricmc.api.ClientModInitializer;

public class ESPModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        ESPMod.LOGGER.info("Initializing ESP Mod Client");
        // Register client-side components here
    }
}
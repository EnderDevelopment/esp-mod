package com.skrzypiecdominik11.espmod.keybind;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import org.lwjgl.glfw.GLFW;

public class KeybindHandler {
    public static final KeyBinding OPEN_GUI_KEY = KeyBindingHelper.registerKeyBinding(new KeyBinding(
            "key.espmod.open_gui",
            InputUtil.Type.KEYSYM,
            GLFW.GLFW_KEY_RIGHT_SHIFT,
            "category.espmod.keybinds"
    ));

    public static void register() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            while (OPEN_GUI_KEY.wasPressed()) {
                if (client.player != null) {
                    client.setScreen(new com.skrzypiecdominik11.espmod.gui.ESPModScreen());
                }
            }
        });
    }
}
package com.skrzypiecdominik11.espmod.gui;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;

public class ESPModScreen extends Screen {
    private int range = 10;

    protected ESPModScreen() {
        super(Text.translatable("gui.espmod.title"));
    }

    @Override
    protected void init() {
        super.init();
        addDrawableChild(new ButtonWidget.Builder(Text.translatable("gui.espmod.esp_option"), button -> {
            // Open block selection screen or toggle ESP
            MinecraftClient.getInstance().setScreen(new BlockSelectionScreen(this));
        }).position(width / 2 - 100, height / 2 - 20).size(200, 20).build());

        addDrawableChild(new ButtonWidget.Builder(Text.translatable("gui.espmod.range_option", range), button -> {
            range = (range + 10) % 100;
            button.setMessage(Text.translatable("gui.espmod.range_option", range));
        }).position(width / 2 - 100, height / 2 + 10).size(200, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        renderBackground(context, mouseX, mouseY, delta);
        super.render(context, mouseX, mouseY, delta);
    }
}
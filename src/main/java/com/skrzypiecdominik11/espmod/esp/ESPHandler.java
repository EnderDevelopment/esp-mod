package com.skrzypiecdominik11.espmod.esp;

import net.minecraft.block.Block;
import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ESPHandler {
    public static void highlightBlocks(Block block, int range) {
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player == null || client.world == null) return;

        World world = client.world;
        BlockPos playerPos = client.player.getBlockPos();

        for (int x = -range; x <= range; x++) {
            for (int y = -range; y <= range; y++) {
                for (int z = -range; z <= range; z++) {
                    BlockPos pos = playerPos.add(x, y, z);
                    if (world.getBlockState(pos).getBlock() == block) {
                        // Highlight the block here
                    }
                }
            }
        }
    }
}
package net.ayumichizuru.unpushslab.block;

import net.ayumichizuru.unpushslab.UnpushSlab;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block OBSIDIAN_SLAB = registerBlock("obsidian_slab",
            new UnpushableSlab(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).strength(3.5F, 1200.0F).requiresTool()));

    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(UnpushSlab.MOD_ID, name), block);
    }


    public static void registerModBlocks() {
        UnpushSlab.LOGGER.info("Registering Mod Blocks for " + UnpushSlab.MOD_ID);
    }

}

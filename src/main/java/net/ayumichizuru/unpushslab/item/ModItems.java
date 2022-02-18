package net.ayumichizuru.unpushslab.item;

import net.ayumichizuru.unpushslab.UnpushSlab;
import net.ayumichizuru.unpushslab.block.ModBlocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item OBSIDIAN_SLAB = registerItem("obsidian_slab",
        new UnpushableSlabItem(ModBlocks.OBSIDIAN_SLAB, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(UnpushSlab.MOD_ID, name), item);
    }

    public static void registerModItems() {
        UnpushSlab.LOGGER.info("Registering Mod Items for " + UnpushSlab.MOD_ID);
    }

}

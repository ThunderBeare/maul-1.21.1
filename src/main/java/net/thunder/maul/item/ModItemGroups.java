package net.thunder.maul.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.thunder.maul.Maul;
import net.thunder.maul.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup PINK_GARNET_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Maul.MOD_ID, "pink_garnet_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.PINK_GARNET))
                    .displayName(Text.translatable("itemgroup.maul.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PINK_GARNET);
                        entries.add(ModItems.RAW_PINK_GARNET);
                        entries.add(ModItems.CHISEL);

                    }).build());

    public static final ItemGroup PINK_GARNET_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Maul.MOD_ID, "pink_garnet_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.PINK_GARNET_BLOCK))
                    .displayName(Text.translatable("itemgroup.maul.pink_garnet_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.PINK_GARNET_BLOCK);
                        entries.add(ModBlocks.RAW_PINK_GARNET_BLOCK);

                        entries.add(ModBlocks.PINK_GARNET_ORE);
                        entries.add(ModBlocks.PINK_GARNET_DEEPSLATE_ORE);

                        entries.add(ModBlocks.MAGIC_BLOCK);

                    }).build());



    public static void registerItemGroups() {
        Maul.LOGGER.info("Registering item groups for " + Maul.MOD_ID);
    }
}

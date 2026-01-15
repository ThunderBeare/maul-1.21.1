package net.thunder.maul.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.thunder.maul.Maul;
import net.thunder.maul.item.custom.ChiselItem;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet", new Item(new Item.Settings()));
    public static final Item RAW_PINK_GARNET = registerItem("raw_pink_garnet", new Item(new Item.Settings()));

    public static final Item CHISEL = registerItem("chisel", new ChiselItem(new Item.Settings().maxDamage(60)));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Maul.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Maul.LOGGER.info("Registering items for " + Maul.MOD_ID);
    }
}

package net.thunder.maul;

import net.fabricmc.api.ModInitializer;

import net.thunder.maul.block.ModBlocks;
import net.thunder.maul.item.ModItemGroups;
import net.thunder.maul.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Maul implements ModInitializer {
	public static final String MOD_ID = "maul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
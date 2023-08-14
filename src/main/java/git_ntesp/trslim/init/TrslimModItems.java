
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;

import git_ntesp.trslim.item.SlimeyBowItem;
import git_ntesp.trslim.item.SlimeyArrowItem;
import git_ntesp.trslim.item.RadioItem;
import git_ntesp.trslim.TrslimMod;

public class TrslimModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TrslimMod.MODID);
	public static final RegistryObject<Item> SLIME_GRASS_BLOCK = block(TrslimModBlocks.SLIME_GRASS_BLOCK);
	public static final RegistryObject<Item> SLIME_DIRT_BLOCK = block(TrslimModBlocks.SLIME_DIRT_BLOCK);
	public static final RegistryObject<Item> SLIME_SPAWN_EGG = REGISTRY.register("slime_spawn_egg", () -> new ForgeSpawnEggItem(TrslimModEntities.SLIME, -13395712, -13369549, new Item.Properties()));
	public static final RegistryObject<Item> SLIMEY_PLANT = doubleBlock(TrslimModBlocks.SLIMEY_PLANT);
	public static final RegistryObject<Item> SLIMEY_ARROW = REGISTRY.register("slimey_arrow", () -> new SlimeyArrowItem());
	public static final RegistryObject<Item> SLIMEY_BOW = REGISTRY.register("slimey_bow", () -> new SlimeyBowItem());
	public static final RegistryObject<Item> SLIME_STONE_BLOCK = block(TrslimModBlocks.SLIME_STONE_BLOCK);
	public static final RegistryObject<Item> SLIMED_ZOMBIE_SPAWN_EGG = REGISTRY.register("slimed_zombie_spawn_egg", () -> new ForgeSpawnEggItem(TrslimModEntities.SLIMED_ZOMBIE, -1, -1, new Item.Properties()));
	public static final RegistryObject<Item> RADIO = REGISTRY.register("radio", () -> new RadioItem());
	public static final RegistryObject<Item> COMMON_SLIME_SPAWN_EGG = REGISTRY.register("common_slime_spawn_egg", () -> new ForgeSpawnEggItem(TrslimModEntities.COMMON_SLIME, -1, -1, new Item.Properties()));

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static RegistryObject<Item> doubleBlock(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}

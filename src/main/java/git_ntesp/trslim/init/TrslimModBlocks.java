
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import git_ntesp.trslim.block.SlimeyPlantBlock;
import git_ntesp.trslim.block.SlimeStoneBlockBlock;
import git_ntesp.trslim.block.SlimeGrassBlockBlock;
import git_ntesp.trslim.block.SlimeDirtBlockBlock;
import git_ntesp.trslim.TrslimMod;

public class TrslimModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TrslimMod.MODID);
	public static final RegistryObject<Block> SLIME_GRASS_BLOCK = REGISTRY.register("slime_grass_block", () -> new SlimeGrassBlockBlock());
	public static final RegistryObject<Block> SLIME_DIRT_BLOCK = REGISTRY.register("slime_dirt_block", () -> new SlimeDirtBlockBlock());
	public static final RegistryObject<Block> SLIMEY_PLANT = REGISTRY.register("slimey_plant", () -> new SlimeyPlantBlock());
	public static final RegistryObject<Block> SLIME_STONE_BLOCK = REGISTRY.register("slime_stone_block", () -> new SlimeStoneBlockBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			SlimeGrassBlockBlock.blockColorLoad(event);
			SlimeDirtBlockBlock.blockColorLoad(event);
			SlimeyPlantBlock.blockColorLoad(event);
			SlimeStoneBlockBlock.blockColorLoad(event);
		}
	}
}

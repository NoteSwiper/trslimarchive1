
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrslimModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(TrslimModItems.SLIMED_ZOMBIE_SPAWN_EGG.get());
			tabData.accept(TrslimModItems.COMMON_SLIME_SPAWN_EGG.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("trslim", "trslim"), builder -> builder.title(Component.translatable("item_group.trslim.trslim")).icon(() -> new ItemStack(Blocks.COMMAND_BLOCK)).displayItems((parameters, tabData) -> {
			tabData.accept(TrslimModBlocks.SLIME_GRASS_BLOCK.get().asItem());
			tabData.accept(TrslimModBlocks.SLIME_DIRT_BLOCK.get().asItem());
			tabData.accept(TrslimModItems.SLIME_SPAWN_EGG.get());
			tabData.accept(TrslimModBlocks.SLIMEY_PLANT.get().asItem());
			tabData.accept(TrslimModItems.SLIMEY_ARROW.get());
			tabData.accept(TrslimModItems.SLIMEY_BOW.get());
			tabData.accept(TrslimModBlocks.SLIME_STONE_BLOCK.get().asItem());
			tabData.accept(TrslimModItems.RADIO.get());
		}).withSearchBar());
	}
}

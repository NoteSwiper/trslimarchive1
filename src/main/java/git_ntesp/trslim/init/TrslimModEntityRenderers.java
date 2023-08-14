
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;

import git_ntesp.trslim.client.renderer.SlimedZombieRenderer;
import git_ntesp.trslim.client.renderer.SlimeRenderer;
import git_ntesp.trslim.client.renderer.CommonSlimeRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class TrslimModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(TrslimModEntities.SLIME.get(), SlimeRenderer::new);
		event.registerEntityRenderer(TrslimModEntities.SLIMEY_BOW.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(TrslimModEntities.SLIMED_ZOMBIE.get(), SlimedZombieRenderer::new);
		event.registerEntityRenderer(TrslimModEntities.COMMON_SLIME.get(), CommonSlimeRenderer::new);
	}
}

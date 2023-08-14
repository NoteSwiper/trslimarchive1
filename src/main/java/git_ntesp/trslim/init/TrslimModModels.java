
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import git_ntesp.trslim.client.model.Modelzombie;
import git_ntesp.trslim.client.model.ModelslimeEntity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class TrslimModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelzombie.LAYER_LOCATION, Modelzombie::createBodyLayer);
		event.registerLayerDefinition(ModelslimeEntity.LAYER_LOCATION, ModelslimeEntity::createBodyLayer);
	}
}

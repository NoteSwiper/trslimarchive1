
package git_ntesp.trslim.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import git_ntesp.trslim.entity.SlimedZombieEntity;
import git_ntesp.trslim.client.model.Modelzombie;

public class SlimedZombieRenderer extends MobRenderer<SlimedZombieEntity, Modelzombie<SlimedZombieEntity>> {
	public SlimedZombieRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzombie(context.bakeLayer(Modelzombie.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SlimedZombieEntity entity) {
		return new ResourceLocation("trslim:textures/entities/slimedzombie.png");
	}
}

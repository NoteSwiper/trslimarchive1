
package git_ntesp.trslim.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import git_ntesp.trslim.entity.CommonSlimeEntity;
import git_ntesp.trslim.client.model.ModelslimeEntity;

public class CommonSlimeRenderer extends MobRenderer<CommonSlimeEntity, ModelslimeEntity<CommonSlimeEntity>> {
	public CommonSlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelslimeEntity(context.bakeLayer(ModelslimeEntity.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(CommonSlimeEntity entity) {
		return new ResourceLocation("trslim:textures/entities/slime.png");
	}
}

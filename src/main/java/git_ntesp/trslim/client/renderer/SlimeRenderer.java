
package git_ntesp.trslim.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SlimeModel;

import git_ntesp.trslim.entity.SlimeEntity;

public class SlimeRenderer extends MobRenderer<SlimeEntity, SlimeModel<SlimeEntity>> {
	public SlimeRenderer(EntityRendererProvider.Context context) {
		super(context, new SlimeModel(context.bakeLayer(ModelLayers.SLIME)), 0.5f);
		this.addLayer(new EyesLayer<SlimeEntity, SlimeModel<SlimeEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("trslim:textures/entities/slime.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SlimeEntity entity) {
		return new ResourceLocation("trslim:textures/entities/slime.png");
	}
}

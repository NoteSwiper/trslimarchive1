
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import git_ntesp.trslim.entity.SlimeyBowEntity;
import git_ntesp.trslim.entity.SlimedZombieEntity;
import git_ntesp.trslim.entity.SlimeEntity;
import git_ntesp.trslim.entity.CommonSlimeEntity;
import git_ntesp.trslim.TrslimMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TrslimModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, TrslimMod.MODID);
	public static final RegistryObject<EntityType<SlimeEntity>> SLIME = register("slime",
			EntityType.Builder.<SlimeEntity>of(SlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimeEntity::new)

					.sized(1f, 1f));
	public static final RegistryObject<EntityType<SlimeyBowEntity>> SLIMEY_BOW = register("projectile_slimey_bow",
			EntityType.Builder.<SlimeyBowEntity>of(SlimeyBowEntity::new, MobCategory.MISC).setCustomClientFactory(SlimeyBowEntity::new).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<SlimedZombieEntity>> SLIMED_ZOMBIE = register("slimed_zombie",
			EntityType.Builder.<SlimedZombieEntity>of(SlimedZombieEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SlimedZombieEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<CommonSlimeEntity>> COMMON_SLIME = register("common_slime",
			EntityType.Builder.<CommonSlimeEntity>of(CommonSlimeEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CommonSlimeEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			SlimeEntity.init();
			SlimedZombieEntity.init();
			CommonSlimeEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(SLIME.get(), SlimeEntity.createAttributes().build());
		event.put(SLIMED_ZOMBIE.get(), SlimedZombieEntity.createAttributes().build());
		event.put(COMMON_SLIME.get(), CommonSlimeEntity.createAttributes().build());
	}
}


/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import git_ntesp.trslim.world.features.plants.SlimeyPlantFeature;
import git_ntesp.trslim.world.features.ores.SlimeStoneBlockFeature;
import git_ntesp.trslim.world.features.ores.SlimeGrassBlockFeature;
import git_ntesp.trslim.world.features.ores.SlimeDirtBlockFeature;
import git_ntesp.trslim.world.features.SmallZombieHallFeature;
import git_ntesp.trslim.TrslimMod;

@Mod.EventBusSubscriber
public class TrslimModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TrslimMod.MODID);
	public static final RegistryObject<Feature<?>> SLIME_GRASS_BLOCK = REGISTRY.register("slime_grass_block", SlimeGrassBlockFeature::new);
	public static final RegistryObject<Feature<?>> SLIME_DIRT_BLOCK = REGISTRY.register("slime_dirt_block", SlimeDirtBlockFeature::new);
	public static final RegistryObject<Feature<?>> SLIMEY_PLANT = REGISTRY.register("slimey_plant", SlimeyPlantFeature::new);
	public static final RegistryObject<Feature<?>> SLIME_STONE_BLOCK = REGISTRY.register("slime_stone_block", SlimeStoneBlockFeature::new);
	public static final RegistryObject<Feature<?>> SMALL_ZOMBIE_HALL = REGISTRY.register("small_zombie_hall", SmallZombieHallFeature::new);
}

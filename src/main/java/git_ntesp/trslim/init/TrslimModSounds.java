
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import git_ntesp.trslim.TrslimMod;

public class TrslimModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TrslimMod.MODID);
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_HURT = REGISTRY.register("slimedzombie.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trslim", "slimedzombie.hurt")));
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_AMBIENT = REGISTRY.register("slimedzombie.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trslim", "slimedzombie.ambient")));
	public static final RegistryObject<SoundEvent> SLIMEDZOMBIE_DEATH = REGISTRY.register("slimedzombie.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("trslim", "slimedzombie.death")));
}

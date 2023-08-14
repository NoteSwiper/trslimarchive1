
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package git_ntesp.trslim.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import git_ntesp.trslim.world.inventory.RadioGUIMenu;
import git_ntesp.trslim.TrslimMod;

public class TrslimModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, TrslimMod.MODID);
	public static final RegistryObject<MenuType<RadioGUIMenu>> RADIO_GUI = REGISTRY.register("radio_gui", () -> IForgeMenuType.create(RadioGUIMenu::new));
}

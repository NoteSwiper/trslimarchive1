package git_ntesp.trslim.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.gui.components.EditBox;

import java.util.HashMap;

import git_ntesp.trslim.network.TrslimModVariables;

public class RadioGUIGUIgaKaikaretatokiProcedure {
	public static void execute(LevelAccessor world, HashMap guistate) {
		if (guistate == null)
			return;
		if (guistate.get("text:label_radiofreqkhz") instanceof EditBox _tf)
			_tf.setValue((TrslimModVariables.MapVariables.get(world).Radio_Frequency + "KHz"));
	}
}


package git_ntesp.trslim.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class SlimeyArrowItem extends Item {
	public SlimeyArrowItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.UNCOMMON));
	}

	@Override
	public int getEnchantmentValue() {
		return 25;
	}
}

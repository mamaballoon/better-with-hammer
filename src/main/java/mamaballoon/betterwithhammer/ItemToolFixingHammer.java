package mamaballoon.betterwithhammer;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;

public class ItemToolFixingHammer extends Item {
	public ItemToolFixingHammer(String translationKey, String namespaceID, int id, ToolMaterial material) {
		super(translationKey, namespaceID, id);
		this.setMaxStackSize(1);
		this.setMaxDamage(material.getDurability());
	}

	@Override
	public boolean onUseOnBlock(@NotNull ItemStack selfStack, @NotNull World world, @org.jetbrains.annotations.Nullable Player player, @NotNull TilePosc blockPos, @NotNull Side side, double xHit, double yHit) {
		for (HammerRecipe currentRecipe : HammerRecipe.HammerRecipes) {
			if (currentRecipe.outputBlock == world.getBlockType(blockPos)) {
				world.setBlockTypeNotify(blockPos, currentRecipe.inputBlock);
				selfStack.damageItem(1,player);
				world.playBlockSoundEffect(player, blockPos.x(), blockPos.y(), blockPos.z(), currentRecipe.inputBlock, EnumBlockSoundEffectType.MINE);
				return true;
			}
		}
		return false;
	}

}

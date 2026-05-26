package mamaballoon.betterwithhammer;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.entity.player.Player;
import net.minecraft.core.enums.EnumBlockSoundEffectType;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.IItemConvertible;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.material.ToolMaterial;
import net.minecraft.core.util.helper.Side;
import net.minecraft.core.world.World;
import net.minecraft.core.world.pos.TilePosc;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ItemToolSledgeHammer extends Item implements IItemConvertible {
	public ItemToolSledgeHammer(String translationKey, String namespaceID, int id, ToolMaterial material){
		super(translationKey, namespaceID, id);
		this.setMaxStackSize(1);
		this.setMaxDamage(material.getDurability());
	}

	@Override
	public boolean onUseOnBlock(@NotNull ItemStack selfStack, @NotNull World world, @org.jetbrains.annotations.Nullable Player player, @NotNull TilePosc blockPos, @NotNull Side side, double xHit, double yHit) {
		for (SledgeHammerRecipe currentRecipe : SledgeHammerRecipe.SledgeHammerRecipes) {
			if (currentRecipe.inputBlock == world.getBlockType(blockPos)) {
				world.setBlockTypeNotify(blockPos, Blocks.AIR);
				Random rand = new Random();
				int itemDrop = rand.nextInt(currentRecipe.min_amount,currentRecipe.max_amount+1);
				for (int x = 0; x < itemDrop;x++){
					world.dropItem(blockPos, new ItemStack(currentRecipe.output, 1));
				}
				selfStack.damageItem(1,player);
				world.playBlockSoundEffect(player, blockPos.x(), blockPos.y(), blockPos.z(), currentRecipe.inputBlock, EnumBlockSoundEffectType.MINE);
				return true;
			}
		}
		return false;
	}
}

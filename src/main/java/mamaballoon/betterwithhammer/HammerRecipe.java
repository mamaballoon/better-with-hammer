package mamaballoon.betterwithhammer;

import net.minecraft.core.block.Block;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;

import java.util.ArrayList;
import java.util.List;

public class HammerRecipe {
	public static List<HammerRecipe> HammerRecipes = new ArrayList<>();
	public Block<?> inputBlock;
	public Block<?> outputBlock;
	public String id;

	public HammerRecipe(String in_id, Block<?> i, Block<?> o){
		inputBlock = i;
		outputBlock = o;
		id = in_id;
		HammerRecipes.add(this);
	}

	public void removeRecipe(){
		HammerRecipes.remove(this);
	}



}

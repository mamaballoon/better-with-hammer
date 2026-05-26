package mamaballoon.betterwithhammer;

import net.minecraft.core.block.Block;
import net.minecraft.core.item.Item;

import java.util.ArrayList;
import java.util.List;

public class SledgeHammerRecipe {
	public static List<SledgeHammerRecipe> SledgeHammerRecipes = new ArrayList<>();
	public Block<?> inputBlock;
	public Item output;
	public int min_amount;
	public int max_amount;
	public String id;

	public SledgeHammerRecipe(String in_id, Block<?> i, Item o, int mina, int maxa){
		id = in_id;
		inputBlock = i;
		output = o;
		min_amount = mina;
		max_amount = maxa;
		SledgeHammerRecipes.add(this);
	}

	public SledgeHammerRecipe(String in_id, Block<?> i, Block<?> o, int mina, int maxa){
		id = in_id;
		inputBlock = i;
		output = o.asItem();
		min_amount = mina;
		max_amount = maxa;
		SledgeHammerRecipes.add(this);
	}

	public void removeRecipe(){
		SledgeHammerRecipes.remove(this);
	}



}

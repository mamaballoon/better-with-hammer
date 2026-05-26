package mamaballoon.betterwithhammer;

import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.ItemStack;
import net.minecraft.core.item.Items;
import turniplabs.halplibe.helper.RecipeBuilder;
import turniplabs.halplibe.helper.recipeBuilders.RecipeBuilderShaped;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static mamaballoon.betterwithhammer.BetterWithHammer.MOD_ID;

public class CraftingRecipes implements RecipeEntrypoint {
	public static void initRecipes() {
		RecipeBuilderShaped HammerTemplate = new RecipeBuilderShaped(MOD_ID, "X#X", " # "," # ")
			.addInput('#', Items.STICK);

		HammerTemplate
			.addInput('X', Blocks.BLOCK_IRON)
			.create("hammer", new ItemStack(HammerItems.HAMMER,1));

		HammerTemplate
			.addInput('X', Blocks.BLOCK_STEEL)
			.create("sledgehammer", new ItemStack(HammerItems.SLEDGEHAMMER,1));
	}

	@Override
	public void onRecipesReady() {
		initRecipes();

	}

	@Override
	public void initNamespaces() {
		RecipeBuilder.initNameSpace(MOD_ID);
		RecipeBuilder.getRecipeNamespace(MOD_ID);
	}
}

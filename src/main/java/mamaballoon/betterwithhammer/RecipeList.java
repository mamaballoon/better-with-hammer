package mamaballoon.betterwithhammer;
import net.minecraft.core.block.Blocks;
import net.minecraft.core.item.Items;


public class RecipeList {
	private static boolean hasInit = false;
	public static void Init(){
		if (!hasInit) {
			hasInit = true;
			initRecipeList();
		}
	}
	public static void initRecipeList(){
		HammerRecipe cobblestone = new HammerRecipe(
			"cobblestone",
			Blocks.STONE,
			Blocks.COBBLE_STONE
		);
		SledgeHammerRecipe pebbles = new SledgeHammerRecipe(
			"pebble",
			Blocks.COBBLE_STONE,
			Items.AMMO_PEBBLE,
			2,
			4
		);
		SledgeHammerRecipe sand = new SledgeHammerRecipe(
			"sand",
			Blocks.SANDSTONE,
			Blocks.SAND,
			2,
			4
		);
		SledgeHammerRecipe brimsand = new SledgeHammerRecipe(
			"brimsand",
			Blocks.BRIMSTONE,
			Blocks.BRIMSAND,
			2,
			4
		);
		HammerRecipe cobble_limestone = new HammerRecipe(
			"cobble_limestone",
			Blocks.LIMESTONE,
			Blocks.COBBLE_LIMESTONE
		);
		HammerRecipe cobble_granite = new HammerRecipe(
			"cobble_granite",
			Blocks.GRANITE,
			Blocks.COBBLE_GRANITE
		);
		HammerRecipe cobble_netherrack = new HammerRecipe(
			"cobble_netherrack",
			Blocks.NETHERRACK,
			Blocks.COBBLE_NETHERRACK
		);
		HammerRecipe cobble_gloomstone = new HammerRecipe(
			"cobble_gloomstone",
			Blocks.GLOOMSTONE,
			Blocks.COBBLE_GLOOMSTONE
		);
		HammerRecipe cobble_permafrost = new HammerRecipe(
			"cobble_permafrost",
			Blocks.PERMAFROST,
			Blocks.COBBLE_PERMAFROST
		);
		HammerRecipe cobble_basalt = new HammerRecipe(
			"cobble_basalt",
			Blocks.BASALT,
			Blocks.COBBLE_BASALT
		);
		HammerRecipe gravel = new HammerRecipe(
			"gravel",
			Blocks.COBBLE_STONE,
			Blocks.GRAVEL
		);
		SledgeHammerRecipe nethercoal_from_magma = new SledgeHammerRecipe(
			"nethercoal_from_magma",
			Blocks.MAGMA,
			Items.NETHERCOAL,
			1,
			2
		);
		SledgeHammerRecipe flint_from_gravel = new SledgeHammerRecipe(
			"flint_from_gravel",
			Blocks.GRAVEL,
			Items.FLINT,
			1,
			2
		);
		SledgeHammerRecipe sulfur = new SledgeHammerRecipe(
			"sulfur",
			Blocks.SULFUR,
			Items.SULFUR,
			2,
			4
		);
		SledgeHammerRecipe dirt_from_dirt = new SledgeHammerRecipe(
			"dirt_from_dirt",
			Blocks.DIRT,
			Blocks.DIRT,
			1,
			1
		);
		SledgeHammerRecipe sand_from_sand = new SledgeHammerRecipe(
			"sand_from_sand",
			Blocks.SAND,
			Blocks.SAND,
			1,
			1
		);
		HammerRecipe dirt = new HammerRecipe(
			"dirt",
			Blocks.GRASS,
			Blocks.DIRT
		);
		HammerRecipe dirt_retro = new HammerRecipe(
			"dirt_retro",
			Blocks.GRASS_RETRO,
			Blocks.DIRT
		);

	}
}

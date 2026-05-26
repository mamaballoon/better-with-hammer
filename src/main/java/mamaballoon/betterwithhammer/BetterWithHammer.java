package mamaballoon.betterwithhammer;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import turniplabs.halplibe.HalpLibe;
import turniplabs.halplibe.util.GameStartEntrypoint;
import turniplabs.halplibe.util.RecipeEntrypoint;

import static net.minecraft.core.data.registry.Registries.NAMESPACES;

public class BetterWithHammer implements ModInitializer, GameStartEntrypoint, RecipeEntrypoint {
	public static final String MOD_ID = HalpLibe.registerMod("betterwithhammer", true);
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("BetterWithHammer initialized.");
	}

	@Override
	public void beforeGameStart() {
		NAMESPACES.register(MOD_ID,MOD_ID);
		HammerItems.Init();
	}

	@Override
	public void afterGameStart() {

	}

	@Override
	public void onRecipesReady() {
		RecipeList.Init();
		CraftingRecipes.initRecipes();
	}

	@Override
	public void initNamespaces() {

	}
}

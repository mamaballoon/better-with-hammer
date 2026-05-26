package mamaballoon.betterwithhammer;

import net.minecraft.core.block.material.Materials;
import net.minecraft.core.item.Item;
import net.minecraft.core.item.material.ToolMaterial;
import turniplabs.halplibe.helper.ItemBuilder;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryCategory;
import turniplabs.halplibe.helper.creativeInventory.CreativeInventoryPlacement;

public class HammerItems {
	public static int StartID = 1920;
	private static final String MOD_ID = BetterWithHammer.MOD_ID;
	public static int newItemID(){
		return StartID++;
	}
	public static Item HAMMER;
	public static Item SLEDGEHAMMER;

	private static boolean hasInit = false;
	public static void Init(){
		if (!hasInit) {
			hasInit = true;
			initItems();
		}
	}
	public static String itemNSID(String string) {
		return MOD_ID + ":item/" + string;
	}
	public static void initItems(){

		HAMMER = new ItemBuilder(MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISC_TOOLS))
			.build(new ItemToolHammer(MOD_ID + ".tool.hammer",itemNSID("hammer"),newItemID(),ToolMaterial.iron));
		SLEDGEHAMMER = new ItemBuilder(MOD_ID)
			.setCreativeInventoryPlacement(new CreativeInventoryPlacement.Category(CreativeInventoryCategory.MISC_TOOLS))
			.build(new ItemToolSledgeHammer(MOD_ID + ".tool.sledgehammer",itemNSID("sledgehammer"),newItemID(),ToolMaterial.iron));
	}
}

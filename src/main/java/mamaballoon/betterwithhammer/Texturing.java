package mamaballoon.betterwithhammer;

import net.minecraft.client.render.EntityRendererDispatcher;
import net.minecraft.client.render.TileEntityRenderDispatcher;
import net.minecraft.client.render.block.color.BlockColorDispatcher;
import net.minecraft.client.render.block.model.BlockModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelDispatcher;
import net.minecraft.client.render.item.model.ItemModelStandard;
import turniplabs.halplibe.util.ModelEntrypoint;

public class Texturing implements ModelEntrypoint{

	@Override
	public void initBlockModels(BlockModelDispatcher dispatcher) {

	}

	@Override
	public void initItemModels(ItemModelDispatcher dispatcher) {
		dispatcher.addDispatch(new ItemModelStandard(HammerItems.HAMMER,null).setIcon("betterwithhammer:item/hammer"));
		dispatcher.addDispatch(new ItemModelStandard(HammerItems.FIXHAMMER,null).setIcon("betterwithhammer:item/fixhammer"));
		dispatcher.addDispatch(new ItemModelStandard(HammerItems.SLEDGEHAMMER,null).setIcon("betterwithhammer:item/sledgehammer"));
	}

	@Override
	public void initEntityModels(EntityRendererDispatcher dispatcher) {

	}

	@Override
	public void initTileEntityModels(TileEntityRenderDispatcher dispatcher) {

	}

	@Override
	public void initBlockColors(BlockColorDispatcher dispatcher) {

	}
}

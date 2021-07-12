package me.jensen.uvavu.feature.module.render;

import me.jensen.uvavu.feature.module.Category;
import me.jensen.uvavu.feature.module.Module;
import me.jensen.uvavu.utils.render.Renderer2D;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.lwjgl.input.Mouse;

import java.awt.*;

public class PlayerModel extends Module {

	public PlayerModel() {
		super("PlayerModel", "Renders the local player model on screen.", Category.RENDER);
	}

	@SubscribeEvent
	public void onRender2D(TickEvent.RenderTickEvent event) {
		Renderer2D.drawEntity(mc.player, new Point(20, 20), new Point(Mouse.getDX(), Mouse.getDY()), 1);
	}

}

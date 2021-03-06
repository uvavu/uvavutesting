package me.jensen.uvavu.feature.ui.click.component.panel;

import me.jensen.uvavu.Client;
import me.jensen.uvavu.feature.module.Category;
import me.jensen.uvavu.feature.module.Module;
import me.jensen.uvavu.feature.traits.IClosable;
import me.jensen.uvavu.feature.ui.click.component.Component;
import me.jensen.uvavu.feature.ui.click.component.button.Button;
import me.jensen.uvavu.utils.render.Colors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Frame implements Component, IClosable {

	private final Category category;
	private final Rectangle size;
	private final Colors colors;

	private boolean open = true;

	private final List<Button> buttons = new ArrayList<>();

	public Frame(Category category, Rectangle size, Colors colors) {
		this.category = category;
		this.size = size;
		this.colors = colors;

		for (Module module : Client.moduleManager.getModules(category)) {

		}
	}

	@Override
	public void render(Point mouse) {

	}

	@Override
	public void onMouseDown(Point mouse, int mb) {

	}

	@Override
	public void onMouseUp(Point mouse, int mb) {

	}

	@Override
	public void onKeyTyped(int key, char character) {

	}

	@Override
	public void onClosed() {

	}

	@Override
	public int height() {
		return 0;
	}

	public boolean isOpen() { return open; }
	public void setOpen(boolean open) { this.open = open; }

	public Category getCategory() { return category; }
	public Rectangle getButton() { return size; }
	public Colors getColors() { return colors; }

}

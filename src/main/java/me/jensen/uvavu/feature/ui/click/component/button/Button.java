package me.jensen.uvavu.feature.ui.click.component.button;

import me.jensen.uvavu.feature.ui.click.component.Component;
import me.jensen.uvavu.utils.render.Colors;

import java.awt.*;

public abstract class Button implements Component {

	protected Rectangle button;
	protected Colors colors;

	public Button(Rectangle button, Colors colors) {
		this.button = button;
		this.colors = colors;
	}

	public boolean hovered(Point mouse) {
		return button.contains(mouse);
	}

}

package me.jensen.uvavu.feature.ui.click.component.button;

import me.jensen.uvavu.feature.settings.Setting;
import me.jensen.uvavu.utils.render.Colors;

import java.awt.*;

public abstract class SettingButton<T> extends Button {

	protected final Setting<T> setting;

	public SettingButton(Setting<T> setting, Rectangle button, Colors colors) {
		super(button, colors);
		this.setting = setting;
	}

	public int height() { return button.height; }

}

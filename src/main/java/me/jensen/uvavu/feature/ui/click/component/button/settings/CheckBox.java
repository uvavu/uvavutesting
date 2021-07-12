package me.jensen.uvavu.feature.ui.click.component.button.settings;

import me.jensen.uvavu.feature.settings.Setting;
import me.jensen.uvavu.feature.ui.click.component.button.SettingButton;
import me.jensen.uvavu.utils.render.Colors;

import java.awt.*;

public class CheckBox extends SettingButton<Boolean> {

	public CheckBox(Setting<Boolean> setting, Rectangle button, Colors colors) {
		super(setting, button, colors);
	}

	@Override
	public void render(Point mouse) {

	}

	@Override
	public void onMouseDown(Point mouse, int mb) {
		if (mb == 0 && hovered(mouse)) {
			setting.setValue(!setting.getValue());
		}
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

}

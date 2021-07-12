package dev.zihasz.client.feature.ui.click.component.button;

import dev.zihasz.client.feature.module.Module;
import dev.zihasz.client.feature.traits.IClosable;
import dev.zihasz.client.utils.render.Colors;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModuleButton extends Button implements IClosable {

	protected final Module module;

	private boolean open = true;

	private final List<SettingButton> settingButtons = new ArrayList<>();

	public ModuleButton(Module module, Rectangle button, Colors colors) {
		super(button, colors);
		this.module = module;
	}

	public void render(Point mouse) {

	}
	public void onMouseDown(Point mouse, int mb) {

	}
	public void onMouseUp(Point mouse, int mb) {

	}
	public void onKeyTyped(int key, char character) {

	}
	public void onClosed() {

	}
	public int height() {
		int height = button.height;
		if (open) {
			for (SettingButton<?> settingButton : settingButtons) {
				height += settingButton.height();
			}
		}
		return height;
	}

	public boolean isOpen() {
		return open;
	}
	public void setOpen(boolean open) {
		this.open = open;
	}

	public Module getModule() {
		return module;
	}

}

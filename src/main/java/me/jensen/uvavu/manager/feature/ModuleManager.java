package me.jensen.uvavu.manager.feature;

import me.jensen.uvavu.Client;
import me.jensen.uvavu.feature.module.*;
import me.jensen.uvavu.manager.Manager;
import me.jensen.uvavu.utils.client.ReflectionUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent;
import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModuleManager extends Manager {

	private final List<Module> modules = new ArrayList<>();

	public ModuleManager() {
		MinecraftForge.EVENT_BUS.register(this);
		try {
			Set<Class<?>> classes = ReflectionUtils.findClasses(Module.class.getPackage().getName(), Module.class);
			for (Class<?> clazz : classes) {
				Module module = (Module) clazz.newInstance();
				this.addModule(module);
			}
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

	@SubscribeEvent
	public void onKeyInput(InputEvent.KeyInputEvent event) {
		if (!Keyboard.getEventKeyState() || Keyboard.getEventKey() == Keyboard.KEY_NONE)
			return;

		for (Module module : Client.moduleManager.getModules())
			if (module.getBind() == Keyboard.getEventKey())
				module.toggle();
	}

	public void addModule(Module module) { this.modules.add(module); }

	public Module getModule(String name) {
		return this.modules.stream()
				.filter(module -> module.name.equalsIgnoreCase(name))
				.findFirst()
				.orElse(null);
	}
	public Module getModule(Class<? extends Module> clazz) {
		return this.modules.stream()
				.filter(module -> module.getClass() == clazz)
				.findFirst()
				.orElse(null);
	}

	public List<Module> getModules() {
		return this.modules;
	}
	public List<Module> getModules(Category category) {
		return this.modules.stream()
				.filter(m -> m.category == category)
				.collect(Collectors.toList());
	}

}

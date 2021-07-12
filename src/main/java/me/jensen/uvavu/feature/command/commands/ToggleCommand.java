package dev.jensen.uvavu.feature.command.commands;

import me.jensen.uvavu.Main;
import me.jensen.uvavu.feature.command.Command;
import me.jensen.uvavu.feature.module.Module;
import me.jensen.uvavu.utils.client.MessageBus;

public class ToggleCommand extends Command {

	public ToggleCommand() {
		super("Toggle", "Toggles a module", "<module name>", "t");
	}

	@Override
	public boolean execute(String[] arguments) {
		if (arguments.length != 1) {
			MessageBus.sendErrorMessage("You need to supply exactly one argument!");
			return false;
		}
		Module module = Client.moduleManager.getModule(arguments[0]);
		if (module == null) {
			MessageBus.sendErrorMessage("You need to supply a valid module name!");
			return false;
		}
		module.toggle();
		return true;
	}
}

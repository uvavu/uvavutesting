package dev.jensen.uvavu.feature.command.commands;

import me.jensen.uvavu.Main;
import me.jensen.uvavu.feature.command.Command;
import me.jensen.uvavu.manager.config.ConfigManager;

import java.awt.*;
import java.net.URI;
import java.nio.file.Paths;

public class FolderCommand extends Command {

	public FolderCommand() {
		super("Folder", "Opens the current main folder", ".folder ", "openfolder", "configfolder", "openconfigs");
	}

	@Override
	public boolean execute(String[] arguments) {
		try {
			Desktop.getDesktop().browse(URI.create(ConfigManager.MAIN_FOLDER));
			return true;
		} catch (Exception exception) {
			return false;
		}
	}
}

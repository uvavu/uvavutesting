package me.jensen.uvavu.manager.config;

import me.jensen.uvavu.Client;
import me.jensen.uvavu.manager.Manager;

public class ConfigManager extends Manager {

	public static final String MAIN_FOLDER = Client.ID + "/";
	public static final String CONFIG_FOLDER = MAIN_FOLDER + "config/";
	public static final String RELATIONS_FOLDER = MAIN_FOLDER + "relations/";
	public static final String DOWNLOADS_FOLDER = MAIN_FOLDER + "downloads/";

	public ConfigManager() {

	}

}

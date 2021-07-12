package me.jensen.uvavu.feature.module.misc;

import me.jensen.uvavu.Main;
import me.jensen.uvavu.feature.module.Category;
import me.jensen.uvavu.feature.module.Module;
import me.jensen.uvavu.feature.settings.Setting;
import me.jensen.uvavu.feature.settings.SettingBuilder;
import net.minecraftforge.client.event.ClientChatEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class ChatSuffix extends Module {

	public ChatSuffix() {
		super("ChatSuffix", "Appends a suffix to all your chat messages.", Category.MISC);
	}

	private final Setting<Boolean> version = new SettingBuilder<>(true)
			.name("Version")
			.description("Show the version of the client in the suffix")
			.build(this);

	@SubscribeEvent
	public void onChat(ClientChatEvent event) {
		if (event.getMessage().startsWith("/")) return;

		event.setMessage(String.format("%s | %s %s", event.getMessage(), Client.NAME, version.getValue() ? Client.VERSION : ""));
	}

}

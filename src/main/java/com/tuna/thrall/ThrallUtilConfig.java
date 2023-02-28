package com.tuna.thrall;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("thrallUtil")
public interface ThrallUtilConfig extends Config
{
	@ConfigItem(
		keyName = "Thrall Utils",
		name = "ReplaceMe!",
		description = "Replaceme!"
	)
	default String greeting()
	{
		return "Hello";
	}
}

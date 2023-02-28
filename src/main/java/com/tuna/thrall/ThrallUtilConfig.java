package com.tuna.thrall;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;

@ConfigGroup("thrallUtil")
public interface ThrallUtilConfig extends Config
{
	@ConfigItem(
		keyName = "thrallDmgCounter",
		name = "Thrall Damage Counter",
		description = "Displays your thralls total damage through the fight.",
		position = 1
	)
	default boolean thrallDmgCounter()
	{
		return true;
	}
	
	@ConfigItem(
		keyName="thrallHider",
		name="Thrall Hider",
		description = "Hides your thralls to prevent them from blocking important area objects",
		position = 2
	)
	default boolean thrallHider()
	{
		return false;
	}
	
	@ConfigItem(
		keyName="thrallPets",
		name="Thrall Pets",
		description = "Replaces your thralls with your pets!",
		position = 3
	)
	default boolean thrallPets()
	{
		return true;
	}
	
	@ConfigItem(
		keyName="thrallPets",
		name="Hide Pets?",
		description = "Hides your pets unless a thrall is out.",
		position = 4
	)
	default boolean hidePets()
	{
		return false;
	}
	
	@ConfigItem(
		keyName="thrallReminders",
		name="Thrall Reminders",
		description = "General Thrall Reminders",
		position = 5
	)
	default boolean thrallReminders()
	{
		return true;
	}
	
	@ConfigItem(
		keyName="thrallRemindersTimer",
		name="Thrall Timer",
		description = "Displays a timer until your thrall despawns",
		position = 6
	)
	default boolean thrallTimer()
	{
		return true;
	}
	
	@ConfigItem(
		keyName="thrallRemindersBook",
		name="Book of the Dead Reminder",
		description = "Reminds you to grab the book of the dead if you have the correct spellbook/runes.",
		position = 7
	)
	default boolean thrallBookOfTheDeadReminder()
	{
		return true;
	}
	
	@ConfigItem(
		keyName="thrallPVMReminder",
		name="PVM Reminder",
		description = "Reminds you to swap to arecceus, what runes are needed, and to bring book of the dead. (Supported Areas: CoX Bank ToB Bank ToA Camel NeX Bank)",
		position = 8
	)
	default boolean thrallPVMReminder(){
		return false;
	}
	
}

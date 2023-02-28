package com.example;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "ThrallUtil"
)
public class ThrallUtilPlugin extends Plugin
{
	@Inject
	private Client client;
	
	@Inject
	private ThrallUtilConfig config;
	
	@Inject
	private ThrallUtilOverlay overlay;

	@Inject
	private OverlayManager overlayManager;

	@Override
	protected void startUp() throws Exception
	{
		overlayManager.add(overlay);
	}

	@Override
	protected void shutDown() throws Exception
	{
		overlayManager.remove(overlay);
		reset();
	}
	
	@Subscribe
	public void onGameTick(GameTick e)
	{
		LocalPoint lp = client.getLocalPlayer().getLocalLocation();
		int newRegionID = lp == null ? -1 : WorldPoint.fromLocalInstance(client, lp).getRegionID();
		
		ThrallRegion newRegion = ThrallRegion.fromRegionID(newRegionID);
		
		if(newRegion != null){
			//set something to true i guess?
		}
		
	}
	
	@Subscribe
	public void onActorDeath(ActorDeath actorDeath)
	{
	
	}
	
	@Subscribe
	public void onHitsplatApplied(HitsplatApplied hitsplatApplied)
	{
	
	}
	

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{

	}
	
	public void reset()
	{
	
	}

	@Provides
	ThrallUtilConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(ThrallUtilConfig.class);
	}
}

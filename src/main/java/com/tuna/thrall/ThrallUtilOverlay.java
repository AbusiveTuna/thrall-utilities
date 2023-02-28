package com.tuna.toa;

import java.awt.Dimension;
import java.awt.Graphics2D;
import java.text.DecimalFormat;
import javax.inject.Inject;

import net.runelite.api.Client;
import net.runelite.client.ui.overlay.OverlayPosition;
import net.runelite.client.ui.overlay.OverlayPriority;
import net.runelite.client.ui.overlay.components.LineComponent;


import net.runelite.client.ui.overlay.OverlayPanel;
import net.runelite.client.ui.overlay.components.TitleComponent;

public class ThrallUtilOverlay extends OverlayPanel
{
    private static final DecimalFormat POINTS_FORMAT = new DecimalFormat("#,###");

    private Client client;
    private ThrallUtilPlugin plugin;
    private ThrallUtilConfig config;

    @Inject
    private ThrallUtilOverlay(Client client,
                             ThrallUtilPlugin plugin,
                             ThrallUtilConfig config)
    {
        this.client = client;
        this.plugin = plugin;
        this.config = config;
        setPosition(OverlayPosition.TOP_RIGHT);
        setPriority(OverlayPriority.HIGH);
    }

    @Override
    public Dimension render(Graphics2D graphics)
    {
    
        panelComponent.getChildren().add(TitleComponent.builder()
                        .text("Thralls!").build());

        panelComponent.getChildren().add(LineComponent.builder()
                .left("Thralls?")
                .right(" Thralls!")
                .build());
                
        return super.render(graphics);
    }
}

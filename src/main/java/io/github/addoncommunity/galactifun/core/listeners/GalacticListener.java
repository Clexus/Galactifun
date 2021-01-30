package io.github.addoncommunity.galactifun.core.listeners;

import io.github.addoncommunity.galactifun.api.CelestialObject;
import io.github.addoncommunity.galactifun.core.GalacticRegistry;
import io.github.mooy1.infinitylib.PluginUtils;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerChangedWorldEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerRespawnEvent;

import javax.annotation.Nonnull;

/**
 * Listeners for celestial object handlers
 * 
 * @author Mooy1
 * @author GallowsDove
 */
public final class GalacticListener implements Listener {

    public static void setup() {
        new GalacticListener();
    }
    
    private GalacticListener() {
        PluginUtils.registerListener(this);
    }
    
    @EventHandler
    public void onPlanetChange(@Nonnull PlayerChangedWorldEvent e){
        CelestialObject object = GalacticRegistry.getCelestialObject(e);
        
        if (object != null) {
            object.applyEffects(e.getPlayer());
        }
    }

    @EventHandler
    public void onPlanetJoin(@Nonnull PlayerJoinEvent e) {
        CelestialObject object = GalacticRegistry.getCelestialObject(e);

        if (object != null) {
            object.applyEffects(e.getPlayer());
        }
    }

    @EventHandler
    public void onPlanetRespawn(@Nonnull PlayerRespawnEvent e) {
        CelestialObject object = GalacticRegistry.getCelestialObject(e);

        if (object != null) {
            object.applyEffects(e.getPlayer());
        }
    }
    
}

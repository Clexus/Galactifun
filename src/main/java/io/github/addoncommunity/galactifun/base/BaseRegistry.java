package io.github.addoncommunity.galactifun.base;

import io.github.addoncommunity.galactifun.api.Moon;
import io.github.addoncommunity.galactifun.api.Planet;
import io.github.addoncommunity.galactifun.base.milkyway.solarsystem.TheMoon;
import io.github.addoncommunity.galactifun.api.Galaxy;
import io.github.addoncommunity.galactifun.api.StarSystem;
import io.github.addoncommunity.galactifun.base.milkyway.solarsystem.Mars;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class BaseRegistry {
    
    public static final Moon THE_MOON = new TheMoon();

    public static final Planet MARS = new Mars();
    
    public static final StarSystem SOLAR_SYSTEM = new StarSystem("Solar System", MARS);

    public static final Galaxy MILKY_WAY = new Galaxy("Milky Way", SOLAR_SYSTEM);

}
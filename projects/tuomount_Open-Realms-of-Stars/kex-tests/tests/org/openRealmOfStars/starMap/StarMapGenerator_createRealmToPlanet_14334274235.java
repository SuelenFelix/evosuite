package org.openRealmOfStars.starMap;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.openRealmOfStars.starMap.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class StarMapGenerator_createRealmToPlanet_14334274235 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term948449;
     Object term948452;

    public StarMapGenerator_createRealmToPlanet_14334274235() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term948449 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term948449, term948449.getClass(), "nameGenerator", null);
        setBooleanField(term948449, term948449.getClass(), "solHasAdded", false);
        setBooleanField(term948449, term948449.getClass(), "destroyedPlanetStartAdded", false);
        setField(term948449, term948449.getClass(), "solarSystem", null);
        setField(term948449, term948449.getClass(), "starMap", null);
        term948452 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term948452;
        callMethod(klass, "createRealmToPlanet", argTypes, term948449, args);
    }

};



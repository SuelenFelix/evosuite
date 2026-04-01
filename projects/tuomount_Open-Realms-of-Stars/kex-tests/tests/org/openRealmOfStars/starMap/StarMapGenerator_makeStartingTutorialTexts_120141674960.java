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

public class StarMapGenerator_makeStartingTutorialTexts_120141674960 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1152378;

    public StarMapGenerator_makeStartingTutorialTexts_120141674960() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1152378 = newInstance(Class.forName("org.openRealmOfStars.starMap.StarMapGenerator"));
        setField(term1152378, term1152378.getClass(), "nameGenerator", null);
        setBooleanField(term1152378, term1152378.getClass(), "solHasAdded", false);
        setBooleanField(term1152378, term1152378.getClass(), "destroyedPlanetStartAdded", false);
        setField(term1152378, term1152378.getClass(), "solarSystem", null);
        setField(term1152378, term1152378.getClass(), "starMap", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.starMap.StarMapGenerator");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        Object[] args = new Object[2];
        args[0] = null;
        args[1] = null;
        callMethod(klass, "makeStartingTutorialTexts", argTypes, term1152378, args);
    }

};



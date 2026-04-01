package org.openRealmOfStars.ai.planet;

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
import static org.openRealmOfStars.ai.planet.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Integer;

public class PlanetHandling_chooseNextConstruction_2797318594 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18615;
     Object term18616;

    public PlanetHandling_chooseNextConstruction_2797318594() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term18615 = newInstance(Class.forName("org.openRealmOfStars.ai.planet.PlanetHandling"));
        term18616 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.planet.PlanetHandling");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.StarMap");
        argTypes[1] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[2] = int.class;
        argTypes[3] = Class.forName("org.openRealmOfStars.player.diplomacy.Attitude");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = null;
        args[2] = term18616;
        args[3] = null;
        callMethod(klass, "chooseNextConstruction", argTypes, term18615, args);
    }

};



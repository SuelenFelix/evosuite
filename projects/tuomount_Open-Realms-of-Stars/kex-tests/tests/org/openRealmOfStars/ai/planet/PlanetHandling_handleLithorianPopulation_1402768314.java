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

public class PlanetHandling_handleLithorianPopulation_1402768314 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term89357;
     Object term89358;

    public PlanetHandling_handleLithorianPopulation_1402768314() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term89357 = newInstance(Class.forName("org.openRealmOfStars.ai.planet.PlanetHandling"));
        term89358 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.ai.planet.PlanetHandling");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.Planet");
        argTypes[1] = Class.forName("org.openRealmOfStars.player.PlayerInfo");
        argTypes[2] = int.class;
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = null;
        args[2] = term89358;
        callMethod(klass, "handleLithorianPopulation", argTypes, term89357, args);
    }

};



package org.openRealmOfStars.player.scenario;

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
import static org.openRealmOfStars.player.scenario.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;

public class StartingScenario_setTemperature_48176589747 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35958;

    public StartingScenario_setTemperature_48176589747() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35958 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35958, term35958.getClass(), "id", null);
        setField(term35958, term35958.getClass(), "type", null);
        setField(term35958, term35958.getClass(), "name", null);
        setField(term35958, term35958.getClass(), "description", null);
        setIntField(term35958, term35958.getClass(), "numberOfScouts", 0);
        setIntField(term35958, term35958.getClass(), "numberOfColonyShips", 0);
        setIntField(term35958, term35958.getClass(), "startingCredit", 0);
        setField(term35958, term35958.getClass(), "waterLevel", null);
        setField(term35958, term35958.getClass(), "temperature", null);
        setIntField(term35958, term35958.getClass(), "planetSize", 0);
        setIntField(term35958, term35958.getClass(), "population", 0);
        setIntField(term35958, term35958.getClass(), "colonyPop", 0);
        setField(term35958, term35958.getClass(), "extraTech", null);
        setField(term35958, term35958.getClass(), "buildings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Object[] args = new Object[1];
        args[0] = null;
        callMethod(klass, "setTemperature", argTypes, term35958, args);
    }

};



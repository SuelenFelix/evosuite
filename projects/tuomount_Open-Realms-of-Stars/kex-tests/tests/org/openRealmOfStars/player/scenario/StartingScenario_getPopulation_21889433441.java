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

public class StartingScenario_getPopulation_21889433441 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35912;

    public StartingScenario_getPopulation_21889433441() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35912 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35912, term35912.getClass(), "id", null);
        setField(term35912, term35912.getClass(), "type", null);
        setField(term35912, term35912.getClass(), "name", null);
        setField(term35912, term35912.getClass(), "description", null);
        setIntField(term35912, term35912.getClass(), "numberOfScouts", 0);
        setIntField(term35912, term35912.getClass(), "numberOfColonyShips", 0);
        setIntField(term35912, term35912.getClass(), "startingCredit", 0);
        setField(term35912, term35912.getClass(), "waterLevel", null);
        setField(term35912, term35912.getClass(), "temperature", null);
        setIntField(term35912, term35912.getClass(), "planetSize", 0);
        setIntField(term35912, term35912.getClass(), "population", 0);
        setIntField(term35912, term35912.getClass(), "colonyPop", 0);
        setField(term35912, term35912.getClass(), "extraTech", null);
        setField(term35912, term35912.getClass(), "buildings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulation", argTypes, term35912, args);
    }

};



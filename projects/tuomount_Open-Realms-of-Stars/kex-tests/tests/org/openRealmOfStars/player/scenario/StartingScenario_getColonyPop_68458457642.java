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

public class StartingScenario_getColonyPop_68458457642 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35919;

    public StartingScenario_getColonyPop_68458457642() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35919 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35919, term35919.getClass(), "id", null);
        setField(term35919, term35919.getClass(), "type", null);
        setField(term35919, term35919.getClass(), "name", null);
        setField(term35919, term35919.getClass(), "description", null);
        setIntField(term35919, term35919.getClass(), "numberOfScouts", 0);
        setIntField(term35919, term35919.getClass(), "numberOfColonyShips", 0);
        setIntField(term35919, term35919.getClass(), "startingCredit", 0);
        setField(term35919, term35919.getClass(), "waterLevel", null);
        setField(term35919, term35919.getClass(), "temperature", null);
        setIntField(term35919, term35919.getClass(), "planetSize", 0);
        setIntField(term35919, term35919.getClass(), "population", 0);
        setIntField(term35919, term35919.getClass(), "colonyPop", 0);
        setField(term35919, term35919.getClass(), "extraTech", null);
        setField(term35919, term35919.getClass(), "buildings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getColonyPop", argTypes, term35919, args);
    }

};



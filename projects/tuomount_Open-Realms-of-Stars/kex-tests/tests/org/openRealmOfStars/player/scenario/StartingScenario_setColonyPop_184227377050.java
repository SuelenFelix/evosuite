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
import java.lang.Integer;

public class StartingScenario_setColonyPop_184227377050 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35983;
     Object term35990;

    public StartingScenario_setColonyPop_184227377050() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35983 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35983, term35983.getClass(), "id", null);
        setField(term35983, term35983.getClass(), "type", null);
        setField(term35983, term35983.getClass(), "name", null);
        setField(term35983, term35983.getClass(), "description", null);
        setIntField(term35983, term35983.getClass(), "numberOfScouts", 0);
        setIntField(term35983, term35983.getClass(), "numberOfColonyShips", 0);
        setIntField(term35983, term35983.getClass(), "startingCredit", 0);
        setField(term35983, term35983.getClass(), "waterLevel", null);
        setField(term35983, term35983.getClass(), "temperature", null);
        setIntField(term35983, term35983.getClass(), "planetSize", 0);
        setIntField(term35983, term35983.getClass(), "population", 0);
        setIntField(term35983, term35983.getClass(), "colonyPop", 0);
        setField(term35983, term35983.getClass(), "extraTech", null);
        setField(term35983, term35983.getClass(), "buildings", null);
        term35990 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term35990;
        callMethod(klass, "setColonyPop", argTypes, term35983, args);
    }

};



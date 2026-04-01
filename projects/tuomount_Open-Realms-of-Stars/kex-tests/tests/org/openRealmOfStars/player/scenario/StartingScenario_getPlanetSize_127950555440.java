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

public class StartingScenario_getPlanetSize_127950555440 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35905;

    public StartingScenario_getPlanetSize_127950555440() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35905 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35905, term35905.getClass(), "id", null);
        setField(term35905, term35905.getClass(), "type", null);
        setField(term35905, term35905.getClass(), "name", null);
        setField(term35905, term35905.getClass(), "description", null);
        setIntField(term35905, term35905.getClass(), "numberOfScouts", 0);
        setIntField(term35905, term35905.getClass(), "numberOfColonyShips", 0);
        setIntField(term35905, term35905.getClass(), "startingCredit", 0);
        setField(term35905, term35905.getClass(), "waterLevel", null);
        setField(term35905, term35905.getClass(), "temperature", null);
        setIntField(term35905, term35905.getClass(), "planetSize", 0);
        setIntField(term35905, term35905.getClass(), "population", 0);
        setIntField(term35905, term35905.getClass(), "colonyPop", 0);
        setField(term35905, term35905.getClass(), "extraTech", null);
        setField(term35905, term35905.getClass(), "buildings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetSize", argTypes, term35905, args);
    }

};



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

public class StartingScenario_getWaterLevel_51456309738 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35891;

    public StartingScenario_getWaterLevel_51456309738() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35891 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35891, term35891.getClass(), "id", null);
        setField(term35891, term35891.getClass(), "type", null);
        setField(term35891, term35891.getClass(), "name", null);
        setField(term35891, term35891.getClass(), "description", null);
        setIntField(term35891, term35891.getClass(), "numberOfScouts", 0);
        setIntField(term35891, term35891.getClass(), "numberOfColonyShips", 0);
        setIntField(term35891, term35891.getClass(), "startingCredit", 0);
        setField(term35891, term35891.getClass(), "waterLevel", null);
        setField(term35891, term35891.getClass(), "temperature", null);
        setIntField(term35891, term35891.getClass(), "planetSize", 0);
        setIntField(term35891, term35891.getClass(), "population", 0);
        setIntField(term35891, term35891.getClass(), "colonyPop", 0);
        setField(term35891, term35891.getClass(), "extraTech", null);
        setField(term35891, term35891.getClass(), "buildings", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaterLevel", argTypes, term35891, args);
    }

};



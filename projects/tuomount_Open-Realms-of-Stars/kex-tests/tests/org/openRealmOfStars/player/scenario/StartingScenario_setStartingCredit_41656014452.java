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

public class StartingScenario_setStartingCredit_41656014452 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term35999;
     Object term36006;

    public StartingScenario_setStartingCredit_41656014452() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term35999 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term35999, term35999.getClass(), "id", null);
        setField(term35999, term35999.getClass(), "type", null);
        setField(term35999, term35999.getClass(), "name", null);
        setField(term35999, term35999.getClass(), "description", null);
        setIntField(term35999, term35999.getClass(), "numberOfScouts", 0);
        setIntField(term35999, term35999.getClass(), "numberOfColonyShips", 0);
        setIntField(term35999, term35999.getClass(), "startingCredit", 0);
        setField(term35999, term35999.getClass(), "waterLevel", null);
        setField(term35999, term35999.getClass(), "temperature", null);
        setIntField(term35999, term35999.getClass(), "planetSize", 0);
        setIntField(term35999, term35999.getClass(), "population", 0);
        setIntField(term35999, term35999.getClass(), "colonyPop", 0);
        setField(term35999, term35999.getClass(), "extraTech", null);
        setField(term35999, term35999.getClass(), "buildings", null);
        term36006 = new Integer(0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term36006;
        callMethod(klass, "setStartingCredit", argTypes, term35999, args);
    }

};



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
import java.lang.String;
import java.lang.Object;
import java.util.ArrayList;

public class StartingScenario_getDescription_11633741665 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9010;

    public StartingScenario_getDescription_11633741665() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9116 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term9115 = ((Class) term9116).getDeclaredField((String) "NO_HOME");
        ((Field) term9115).setAccessible(true);
        Object enum23 = ((Field) term9115).get((Object) null);
        Class<? extends Object> term9449 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term9448 = ((Class) term9449).getDeclaredField((String) "HUMID");
        ((Field) term9448).setAccessible(true);
        Object enum24 = ((Field) term9448).get((Object) null);
        Class<? extends Object> term9751 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term9750 = ((Class) term9751).getDeclaredField((String) "TROPICAL");
        ((Field) term9750).setAccessible(true);
        Object enum25 = ((Field) term9750).get((Object) null);
        ArrayList term9085 = new ArrayList();
        ArrayList term9089 = new ArrayList();
        ((ArrayList) term9089).add("uWHnvSvaPl");
        term9010 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term9010, term9010.getClass(), "id", "hoicvmsovO");
        setField(term9010, term9010.getClass(), "type", enum23);
        setField(term9010, term9010.getClass(), "name", "eqJfYWRaEL");
        setField(term9010, term9010.getClass(), "description", "fhkbdRViHi");
        setIntField(term9010, term9010.getClass(), "numberOfScouts", 1135664017);
        setIntField(term9010, term9010.getClass(), "numberOfColonyShips", 590364439);
        setIntField(term9010, term9010.getClass(), "startingCredit", 865208305);
        setField(term9010, term9010.getClass(), "waterLevel", enum24);
        setField(term9010, term9010.getClass(), "temperature", enum25);
        setIntField(term9010, term9010.getClass(), "planetSize", -1275173084);
        setIntField(term9010, term9010.getClass(), "population", -244121226);
        setIntField(term9010, term9010.getClass(), "colonyPop", -203030934);
        setField(term9010, term9010.getClass(), "extraTech", term9085);
        setField(term9010, term9010.getClass(), "buildings", term9089);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getDescription", argTypes, term9010, args);
    }

};



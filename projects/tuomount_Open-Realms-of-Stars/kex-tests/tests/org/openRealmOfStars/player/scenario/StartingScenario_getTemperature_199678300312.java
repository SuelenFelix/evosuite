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

public class StartingScenario_getTemperature_199678300312 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term17098;

    public StartingScenario_getTemperature_199678300312() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term17251 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term17250 = ((Class) term17251).getDeclaredField((String) "REGULAR");
        ((Field) term17250).setAccessible(true);
        Object enum44 = ((Field) term17250).get((Object) null);
        Class<? extends Object> term17584 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term17583 = ((Class) term17584).getDeclaredField((String) "HUMID");
        ((Field) term17583).setAccessible(true);
        Object enum45 = ((Field) term17583).get((Object) null);
        Class<? extends Object> term17886 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term17885 = ((Class) term17886).getDeclaredField((String) "INFERNO");
        ((Field) term17885).setAccessible(true);
        Object enum46 = ((Field) term17885).get((Object) null);
        ArrayList term17172 = new ArrayList();
        ((ArrayList) term17172).add("WzMEhMXkKx");
        ((ArrayList) term17172).add("XOiDvlDhdc");
        ArrayList term17200 = new ArrayList();
        ((ArrayList) term17200).add("AdxvLJhNLe");
        ((ArrayList) term17200).add("lHfTrWKMPk");
        ((ArrayList) term17200).add("JDaAnsVTGV");
        term17098 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term17098, term17098.getClass(), "id", "mXGCWJDOqA");
        setField(term17098, term17098.getClass(), "type", enum44);
        setField(term17098, term17098.getClass(), "name", "dpNsDgfPso");
        setField(term17098, term17098.getClass(), "description", "hCWPJQKpdc");
        setIntField(term17098, term17098.getClass(), "numberOfScouts", -93135961);
        setIntField(term17098, term17098.getClass(), "numberOfColonyShips", -112921587);
        setIntField(term17098, term17098.getClass(), "startingCredit", 933028652);
        setField(term17098, term17098.getClass(), "waterLevel", enum45);
        setField(term17098, term17098.getClass(), "temperature", enum46);
        setIntField(term17098, term17098.getClass(), "planetSize", 287287233);
        setIntField(term17098, term17098.getClass(), "population", 962840079);
        setIntField(term17098, term17098.getClass(), "colonyPop", 1540719661);
        setField(term17098, term17098.getClass(), "extraTech", term17172);
        setField(term17098, term17098.getClass(), "buildings", term17200);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getTemperature", argTypes, term17098, args);
    }

};



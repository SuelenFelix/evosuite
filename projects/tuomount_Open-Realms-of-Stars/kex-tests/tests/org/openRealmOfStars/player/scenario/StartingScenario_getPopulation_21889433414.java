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

public class StartingScenario_getPopulation_21889433414 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term19586;

    public StartingScenario_getPopulation_21889433414() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term19817 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term19816 = ((Class) term19817).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term19816).setAccessible(true);
        Object enum50 = ((Field) term19816).get((Object) null);
        Class<? extends Object> term20165 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term20164 = ((Class) term20165).getDeclaredField((String) "HUMID");
        ((Field) term20164).setAccessible(true);
        Object enum51 = ((Field) term20164).get((Object) null);
        Class<? extends Object> term20467 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term20466 = ((Class) term20467).getDeclaredField((String) "VOLCANIC");
        ((Field) term20466).setAccessible(true);
        Object enum52 = ((Field) term20466).get((Object) null);
        ArrayList term19666 = new ArrayList();
        ((ArrayList) term19666).add("UfQtPRyWRC");
        ((ArrayList) term19666).add("FPvxVzzSvD");
        ((ArrayList) term19666).add("WHcwFgsGFC");
        ((ArrayList) term19666).add("HzqpegHiRq");
        ArrayList term19718 = new ArrayList();
        ((ArrayList) term19718).add("jwsfVjMoJT");
        ((ArrayList) term19718).add("ZfdXfCCFDf");
        ((ArrayList) term19718).add("MwwjNtdOFT");
        ((ArrayList) term19718).add("VYkqXKVlAJ");
        ((ArrayList) term19718).add("XkIoWJRNwN");
        ((ArrayList) term19718).add("aNWLJdrZMq");
        ((ArrayList) term19718).add("HHmNoYxIGj");
        term19586 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term19586, term19586.getClass(), "id", "pXOkjyeIRb");
        setField(term19586, term19586.getClass(), "type", enum50);
        setField(term19586, term19586.getClass(), "name", "GgZWSjxjyE");
        setField(term19586, term19586.getClass(), "description", "EeBVbzjcCI");
        setIntField(term19586, term19586.getClass(), "numberOfScouts", -478195677);
        setIntField(term19586, term19586.getClass(), "numberOfColonyShips", 972867650);
        setIntField(term19586, term19586.getClass(), "startingCredit", 1655935355);
        setField(term19586, term19586.getClass(), "waterLevel", enum51);
        setField(term19586, term19586.getClass(), "temperature", enum52);
        setIntField(term19586, term19586.getClass(), "planetSize", -481533957);
        setIntField(term19586, term19586.getClass(), "population", 1240914516);
        setIntField(term19586, term19586.getClass(), "colonyPop", -1465035361);
        setField(term19586, term19586.getClass(), "extraTech", term19666);
        setField(term19586, term19586.getClass(), "buildings", term19718);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPopulation", argTypes, term19586, args);
    }

};



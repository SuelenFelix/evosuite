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

public class StartingScenario_getStartingCredit_195666075024 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term32093;

    public StartingScenario_getStartingCredit_195666075024() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term32272 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term32271 = ((Class) term32272).getDeclaredField((String) "REGULAR");
        ((Field) term32271).setAccessible(true);
        Object enum82 = ((Field) term32271).get((Object) null);
        Class<? extends Object> term32605 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term32604 = ((Class) term32605).getDeclaredField((String) "MARINE");
        ((Field) term32604).setAccessible(true);
        Object enum83 = ((Field) term32604).get((Object) null);
        Class<? extends Object> term32910 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term32909 = ((Class) term32910).getDeclaredField((String) "VOLCANIC");
        ((Field) term32909).setAccessible(true);
        Object enum84 = ((Field) term32909).get((Object) null);
        ArrayList term32169 = new ArrayList();
        ((ArrayList) term32169).add("nghfqDXyCG");
        ((ArrayList) term32169).add("WBAOTqErtm");
        ((ArrayList) term32169).add("PqtVXXZMqK");
        ((ArrayList) term32169).add("rYbtIDVdnd");
        ((ArrayList) term32169).add("UKAReurpHG");
        ((ArrayList) term32169).add("WVRMUmrljA");
        ArrayList term32245 = new ArrayList();
        ((ArrayList) term32245).add("NTlKJDDWlk");
        term32093 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term32093, term32093.getClass(), "id", "IpQuOGMgmj");
        setField(term32093, term32093.getClass(), "type", enum82);
        setField(term32093, term32093.getClass(), "name", "pJbnHTYrxn");
        setField(term32093, term32093.getClass(), "description", "iIRsCSYqXH");
        setIntField(term32093, term32093.getClass(), "numberOfScouts", 9726679);
        setIntField(term32093, term32093.getClass(), "numberOfColonyShips", -25637976);
        setIntField(term32093, term32093.getClass(), "startingCredit", 1555897383);
        setField(term32093, term32093.getClass(), "waterLevel", enum83);
        setField(term32093, term32093.getClass(), "temperature", enum84);
        setIntField(term32093, term32093.getClass(), "planetSize", 202001407);
        setIntField(term32093, term32093.getClass(), "population", 158873461);
        setIntField(term32093, term32093.getClass(), "colonyPop", -430151637);
        setField(term32093, term32093.getClass(), "extraTech", term32169);
        setField(term32093, term32093.getClass(), "buildings", term32245);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getStartingCredit", argTypes, term32093, args);
    }

};



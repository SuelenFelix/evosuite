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

public class StartingScenario_getPlanetSize_127950555413 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term18248;

    public StartingScenario_getPlanetSize_127950555413() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term18500 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term18499 = ((Class) term18500).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term18499).setAccessible(true);
        Object enum47 = ((Field) term18499).get((Object) null);
        Class<? extends Object> term18848 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term18847 = ((Class) term18848).getDeclaredField((String) "DESERT");
        ((Field) term18847).setAccessible(true);
        Object enum48 = ((Field) term18847).get((Object) null);
        Class<? extends Object> term19153 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term19152 = ((Class) term19153).getDeclaredField((String) "COLD");
        ((Field) term19152).setAccessible(true);
        Object enum49 = ((Field) term19152).get((Object) null);
        ArrayList term18325 = new ArrayList();
        ((ArrayList) term18325).add("OJJtVNPyKZ");
        ((ArrayList) term18325).add("AKNapTAfmD");
        ((ArrayList) term18325).add("xJgPlLxpgC");
        ((ArrayList) term18325).add("EYtfuJaxiM");
        ArrayList term18377 = new ArrayList();
        ((ArrayList) term18377).add("gCWtLVKVVe");
        ((ArrayList) term18377).add("fWKJoSoCwE");
        ((ArrayList) term18377).add("wfaXBpWAUH");
        ((ArrayList) term18377).add("VMeAzAHwZj");
        ((ArrayList) term18377).add("PznxWXsZME");
        ((ArrayList) term18377).add("ZzIujlwVsw");
        ((ArrayList) term18377).add("LWyEaeIyAo");
        ((ArrayList) term18377).add("yVMkkQhvmN");
        ((ArrayList) term18377).add("mvrkADEgpp");
        term18248 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term18248, term18248.getClass(), "id", "mLUZFTfjle");
        setField(term18248, term18248.getClass(), "type", enum47);
        setField(term18248, term18248.getClass(), "name", "xIeFjkHkOe");
        setField(term18248, term18248.getClass(), "description", "SdCKLMIYnX");
        setIntField(term18248, term18248.getClass(), "numberOfScouts", 1265463001);
        setIntField(term18248, term18248.getClass(), "numberOfColonyShips", 335112684);
        setIntField(term18248, term18248.getClass(), "startingCredit", 1551099402);
        setField(term18248, term18248.getClass(), "waterLevel", enum48);
        setField(term18248, term18248.getClass(), "temperature", enum49);
        setIntField(term18248, term18248.getClass(), "planetSize", -2027534003);
        setIntField(term18248, term18248.getClass(), "population", 1063420942);
        setIntField(term18248, term18248.getClass(), "colonyPop", 1375330971);
        setField(term18248, term18248.getClass(), "extraTech", term18325);
        setField(term18248, term18248.getClass(), "buildings", term18377);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getPlanetSize", argTypes, term18248, args);
    }

};



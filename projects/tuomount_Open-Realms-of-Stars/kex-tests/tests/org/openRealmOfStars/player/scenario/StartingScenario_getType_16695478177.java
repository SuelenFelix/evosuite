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

public class StartingScenario_getType_16695478177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term11188;

    public StartingScenario_getType_16695478177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term11378 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term11377 = ((Class) term11378).getDeclaredField((String) "NO_HOME");
        ((Field) term11377).setAccessible(true);
        Object enum29 = ((Field) term11377).get((Object) null);
        Class<? extends Object> term11711 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term11710 = ((Class) term11711).getDeclaredField((String) "OCEAN");
        ((Field) term11710).setAccessible(true);
        Object enum30 = ((Field) term11710).get((Object) null);
        Class<? extends Object> term12013 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term12012 = ((Class) term12013).getDeclaredField((String) "TROPICAL");
        ((Field) term12012).setAccessible(true);
        Object enum31 = ((Field) term12012).get((Object) null);
        ArrayList term11263 = new ArrayList();
        ((ArrayList) term11263).add("HqBOwkVqjD");
        ((ArrayList) term11263).add("MAcUBcBckh");
        ((ArrayList) term11263).add("oVgzLbrsFr");
        ((ArrayList) term11263).add("vQVyKLdtaz");
        ((ArrayList) term11263).add("OWKQODBLzb");
        ((ArrayList) term11263).add("wGmYcqUkgE");
        ((ArrayList) term11263).add("idgaQsnJpQ");
        ArrayList term11351 = new ArrayList();
        ((ArrayList) term11351).add("VgZnGoIFwQ");
        term11188 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term11188, term11188.getClass(), "id", "IgRJUzaCwW");
        setField(term11188, term11188.getClass(), "type", enum29);
        setField(term11188, term11188.getClass(), "name", "JUmudUmaaV");
        setField(term11188, term11188.getClass(), "description", "KoyGrUJeJW");
        setIntField(term11188, term11188.getClass(), "numberOfScouts", -469968304);
        setIntField(term11188, term11188.getClass(), "numberOfColonyShips", -1145578966);
        setIntField(term11188, term11188.getClass(), "startingCredit", 679763016);
        setField(term11188, term11188.getClass(), "waterLevel", enum30);
        setField(term11188, term11188.getClass(), "temperature", enum31);
        setIntField(term11188, term11188.getClass(), "planetSize", 1962444399);
        setIntField(term11188, term11188.getClass(), "population", 767834723);
        setIntField(term11188, term11188.getClass(), "colonyPop", -602026508);
        setField(term11188, term11188.getClass(), "extraTech", term11263);
        setField(term11188, term11188.getClass(), "buildings", term11351);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getType", argTypes, term11188, args);
    }

};



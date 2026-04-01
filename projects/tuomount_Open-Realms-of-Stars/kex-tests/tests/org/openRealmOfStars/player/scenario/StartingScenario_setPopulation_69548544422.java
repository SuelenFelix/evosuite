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
import java.lang.Integer;

public class StartingScenario_setPopulation_69548544422 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term29781;
     Object term29948;

    public StartingScenario_setPopulation_69548544422() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term29961 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term29960 = ((Class) term29961).getDeclaredField((String) "NO_HOME");
        ((Field) term29960).setAccessible(true);
        Object enum76 = ((Field) term29960).get((Object) null);
        Class<? extends Object> term30294 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term30293 = ((Class) term30294).getDeclaredField((String) "HUMID");
        ((Field) term30293).setAccessible(true);
        Object enum77 = ((Field) term30293).get((Object) null);
        Class<? extends Object> term30596 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term30595 = ((Class) term30596).getDeclaredField((String) "TROPICAL");
        ((Field) term30595).setAccessible(true);
        Object enum78 = ((Field) term30595).get((Object) null);
        ArrayList term29856 = new ArrayList();
        ArrayList term29860 = new ArrayList();
        ((ArrayList) term29860).add("qCpEbQDHdF");
        ((ArrayList) term29860).add("AHbZyFOmlo");
        ((ArrayList) term29860).add("TwfWVQGiIj");
        ((ArrayList) term29860).add("gUvcueTURF");
        ((ArrayList) term29860).add("EwQBhZjCIT");
        ((ArrayList) term29860).add("aSkmSwTnEw");
        ((ArrayList) term29860).add("xvkbvaEGYd");
        term29781 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term29781, term29781.getClass(), "id", "WXMWFDGcLB");
        setField(term29781, term29781.getClass(), "type", enum76);
        setField(term29781, term29781.getClass(), "name", "wKWbJssZuG");
        setField(term29781, term29781.getClass(), "description", "NzBMMhkhpT");
        setIntField(term29781, term29781.getClass(), "numberOfScouts", -2015854073);
        setIntField(term29781, term29781.getClass(), "numberOfColonyShips", 538259104);
        setIntField(term29781, term29781.getClass(), "startingCredit", 96566506);
        setField(term29781, term29781.getClass(), "waterLevel", enum77);
        setField(term29781, term29781.getClass(), "temperature", enum78);
        setIntField(term29781, term29781.getClass(), "planetSize", -343325701);
        setIntField(term29781, term29781.getClass(), "population", 107945604);
        setIntField(term29781, term29781.getClass(), "colonyPop", -1963464809);
        setField(term29781, term29781.getClass(), "extraTech", term29856);
        setField(term29781, term29781.getClass(), "buildings", term29860);
        term29948 = new Integer(71190297);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term29948;
        callMethod(klass, "setPopulation", argTypes, term29781, args);
    }

};



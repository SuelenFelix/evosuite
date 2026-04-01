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

public class StartingScenario_addTech_13354775751 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3715;

    public StartingScenario_addTech_13354775751() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term3885 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term3884 = ((Class) term3885).getDeclaredField((String) "UTOPIA_WORLD");
        ((Field) term3884).setAccessible(true);
        Object enum11 = ((Field) term3884).get((Object) null);
        Class<? extends Object> term4289 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term4288 = ((Class) term4289).getDeclaredField((String) "DESERT");
        ((Field) term4288).setAccessible(true);
        Object enum12 = ((Field) term4288).get((Object) null);
        Class<? extends Object> term4677 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term4676 = ((Class) term4677).getDeclaredField((String) "ARCTIC");
        ((Field) term4676).setAccessible(true);
        Object enum13 = ((Field) term4676).get((Object) null);
        ArrayList term3794 = new ArrayList();
        ((ArrayList) term3794).add("RMFIsYGgne");
        ((ArrayList) term3794).add("NRdvgJlhkX");
        ((ArrayList) term3794).add("uuaPigETmJ");
        ((ArrayList) term3794).add("MxlszYVzRf");
        ((ArrayList) term3794).add("LQFpaHEwXR");
        ArrayList term3858 = new ArrayList();
        term3715 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term3715, term3715.getClass(), "id", "SzjVpOQTyS");
        setField(term3715, term3715.getClass(), "type", enum11);
        setField(term3715, term3715.getClass(), "name", "MjGYSRKTNF");
        setField(term3715, term3715.getClass(), "description", "hRNSzYYIrc");
        setIntField(term3715, term3715.getClass(), "numberOfScouts", 1162663216);
        setIntField(term3715, term3715.getClass(), "numberOfColonyShips", 1484323161);
        setIntField(term3715, term3715.getClass(), "startingCredit", 391863371);
        setField(term3715, term3715.getClass(), "waterLevel", enum12);
        setField(term3715, term3715.getClass(), "temperature", enum13);
        setIntField(term3715, term3715.getClass(), "planetSize", -1922583790);
        setIntField(term3715, term3715.getClass(), "population", -616727354);
        setIntField(term3715, term3715.getClass(), "colonyPop", -1955890973);
        setField(term3715, term3715.getClass(), "extraTech", term3794);
        setField(term3715, term3715.getClass(), "buildings", term3858);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "oVcInYnLWB";
        callMethod(klass, "addTech", argTypes, term3715, args);
    }

};



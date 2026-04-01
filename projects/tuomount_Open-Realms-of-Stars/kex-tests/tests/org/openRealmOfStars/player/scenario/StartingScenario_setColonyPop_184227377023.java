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

public class StartingScenario_setColonyPop_184227377023 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term30981;
     Object term31100;

    public StartingScenario_setColonyPop_184227377023() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term31113 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term31112 = ((Class) term31113).getDeclaredField((String) "REGULAR");
        ((Field) term31112).setAccessible(true);
        Object enum79 = ((Field) term31112).get((Object) null);
        Class<? extends Object> term31446 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term31445 = ((Class) term31446).getDeclaredField((String) "MARINE");
        ((Field) term31445).setAccessible(true);
        Object enum80 = ((Field) term31445).get((Object) null);
        Class<? extends Object> term31751 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term31750 = ((Class) term31751).getDeclaredField((String) "INFERNO");
        ((Field) term31750).setAccessible(true);
        Object enum81 = ((Field) term31750).get((Object) null);
        ArrayList term31056 = new ArrayList();
        ((ArrayList) term31056).add("XfRABIFVEp");
        ((ArrayList) term31056).add("MHGKyEnwKc");
        ArrayList term31084 = new ArrayList();
        ((ArrayList) term31084).add("ShIELyuULw");
        term30981 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term30981, term30981.getClass(), "id", "HBGNxdNURv");
        setField(term30981, term30981.getClass(), "type", enum79);
        setField(term30981, term30981.getClass(), "name", "mfCpTPPQQm");
        setField(term30981, term30981.getClass(), "description", "OcJCIDNIXA");
        setIntField(term30981, term30981.getClass(), "numberOfScouts", 1202361360);
        setIntField(term30981, term30981.getClass(), "numberOfColonyShips", -2015048153);
        setIntField(term30981, term30981.getClass(), "startingCredit", -2063457669);
        setField(term30981, term30981.getClass(), "waterLevel", enum80);
        setField(term30981, term30981.getClass(), "temperature", enum81);
        setIntField(term30981, term30981.getClass(), "planetSize", -1222006000);
        setIntField(term30981, term30981.getClass(), "population", 2095798786);
        setIntField(term30981, term30981.getClass(), "colonyPop", -1565502840);
        setField(term30981, term30981.getClass(), "extraTech", term31056);
        setField(term30981, term30981.getClass(), "buildings", term31084);
        term31100 = new Integer(344323424);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = int.class;
        Object[] args = new Object[1];
        args[0] = term31100;
        callMethod(klass, "setColonyPop", argTypes, term30981, args);
    }

};



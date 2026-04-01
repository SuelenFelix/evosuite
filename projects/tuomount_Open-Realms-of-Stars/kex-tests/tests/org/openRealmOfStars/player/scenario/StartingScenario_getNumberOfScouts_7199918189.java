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

public class StartingScenario_getNumberOfScouts_7199918189 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13668;

    public StartingScenario_getNumberOfScouts_7199918189() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term13818 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term13817 = ((Class) term13818).getDeclaredField((String) "NO_HOME");
        ((Field) term13817).setAccessible(true);
        Object enum35 = ((Field) term13817).get((Object) null);
        Class<? extends Object> term14151 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term14150 = ((Class) term14151).getDeclaredField((String) "HUMID");
        ((Field) term14150).setAccessible(true);
        Object enum36 = ((Field) term14150).get((Object) null);
        Class<? extends Object> term14453 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term14452 = ((Class) term14453).getDeclaredField((String) "COLD");
        ((Field) term14452).setAccessible(true);
        Object enum37 = ((Field) term14452).get((Object) null);
        ArrayList term13739 = new ArrayList();
        ((ArrayList) term13739).add("XPKmummaqg");
        ((ArrayList) term13739).add("BKLfkLiZTH");
        ((ArrayList) term13739).add("SPpkrGcPRr");
        ((ArrayList) term13739).add("sEccwbJKYE");
        ArrayList term13791 = new ArrayList();
        ((ArrayList) term13791).add("AWRooQKkdW");
        term13668 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term13668, term13668.getClass(), "id", "DfISiziTgG");
        setField(term13668, term13668.getClass(), "type", enum35);
        setField(term13668, term13668.getClass(), "name", "XqgfKFvPSD");
        setField(term13668, term13668.getClass(), "description", "JiVRgTZvKc");
        setIntField(term13668, term13668.getClass(), "numberOfScouts", -14890619);
        setIntField(term13668, term13668.getClass(), "numberOfColonyShips", 1632125673);
        setIntField(term13668, term13668.getClass(), "startingCredit", 454281060);
        setField(term13668, term13668.getClass(), "waterLevel", enum36);
        setField(term13668, term13668.getClass(), "temperature", enum37);
        setIntField(term13668, term13668.getClass(), "planetSize", -1786399638);
        setIntField(term13668, term13668.getClass(), "population", 2055867847);
        setIntField(term13668, term13668.getClass(), "colonyPop", -1048298087);
        setField(term13668, term13668.getClass(), "extraTech", term13739);
        setField(term13668, term13668.getClass(), "buildings", term13791);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getNumberOfScouts", argTypes, term13668, args);
    }

};



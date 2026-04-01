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

public class StartingScenario_getWaterLevel_51456309711 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term16002;

    public StartingScenario_getWaterLevel_51456309711() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term16122 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term16121 = ((Class) term16122).getDeclaredField((String) "NO_HOME");
        ((Field) term16121).setAccessible(true);
        Object enum41 = ((Field) term16121).get((Object) null);
        Class<? extends Object> term16455 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term16454 = ((Class) term16455).getDeclaredField((String) "MARINE");
        ((Field) term16454).setAccessible(true);
        Object enum42 = ((Field) term16454).get((Object) null);
        Class<? extends Object> term16760 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term16759 = ((Class) term16760).getDeclaredField((String) "TEMPERATE");
        ((Field) term16759).setAccessible(true);
        Object enum43 = ((Field) term16759).get((Object) null);
        ArrayList term16079 = new ArrayList();
        ((ArrayList) term16079).add("XylxrMBraH");
        ArrayList term16095 = new ArrayList();
        ((ArrayList) term16095).add("pORebkoRdD");
        term16002 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term16002, term16002.getClass(), "id", "yGtHPyvYiQ");
        setField(term16002, term16002.getClass(), "type", enum41);
        setField(term16002, term16002.getClass(), "name", "MvRIxilFMJ");
        setField(term16002, term16002.getClass(), "description", "iNwOJRBEjp");
        setIntField(term16002, term16002.getClass(), "numberOfScouts", 97029295);
        setIntField(term16002, term16002.getClass(), "numberOfColonyShips", -1371869594);
        setIntField(term16002, term16002.getClass(), "startingCredit", -2095575670);
        setField(term16002, term16002.getClass(), "waterLevel", enum42);
        setField(term16002, term16002.getClass(), "temperature", enum43);
        setIntField(term16002, term16002.getClass(), "planetSize", 1225272962);
        setIntField(term16002, term16002.getClass(), "population", 1324040357);
        setIntField(term16002, term16002.getClass(), "colonyPop", -1588772968);
        setField(term16002, term16002.getClass(), "extraTech", term16079);
        setField(term16002, term16002.getClass(), "buildings", term16095);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "getWaterLevel", argTypes, term16002, args);
    }

};



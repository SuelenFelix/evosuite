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

public class StartingScenario_toString_116074286426 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term34657;

    public StartingScenario_toString_116074286426() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term34820 = Class.forName((String) "org.openRealmOfStars.player.scenario.StartingScenarioType");
        Field term34819 = ((Class) term34820).getDeclaredField((String) "DOOMED");
        ((Field) term34819).setAccessible(true);
        Object enum88 = ((Field) term34819).get((Object) null);
        Class<? extends Object> term35150 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.WaterLevelType");
        Field term35149 = ((Class) term35150).getDeclaredField((String) "HUMID");
        ((Field) term35149).setAccessible(true);
        Object enum89 = ((Field) term35149).get((Object) null);
        Class<? extends Object> term35452 = Class.forName((String) "org.openRealmOfStars.starMap.planet.enums.TemperatureType");
        Field term35451 = ((Class) term35452).getDeclaredField((String) "ARCTIC");
        ((Field) term35451).setAccessible(true);
        Object enum90 = ((Field) term35451).get((Object) null);
        ArrayList term34729 = new ArrayList();
        ((ArrayList) term34729).add("BwtdjiefJn");
        ArrayList term34745 = new ArrayList();
        ((ArrayList) term34745).add("jDmhBrIoDa");
        ((ArrayList) term34745).add("SPtPatHeOm");
        ((ArrayList) term34745).add("ywmcuThdfL");
        ((ArrayList) term34745).add("GBOEuByOfr");
        ((ArrayList) term34745).add("NHbOFFjyVK");
        term34657 = newInstance(Class.forName("org.openRealmOfStars.player.scenario.StartingScenario"));
        setField(term34657, term34657.getClass(), "id", "onQLVONGuf");
        setField(term34657, term34657.getClass(), "type", enum88);
        setField(term34657, term34657.getClass(), "name", "SOrEHbcbmn");
        setField(term34657, term34657.getClass(), "description", "bnsyeQXFdu");
        setIntField(term34657, term34657.getClass(), "numberOfScouts", -227365013);
        setIntField(term34657, term34657.getClass(), "numberOfColonyShips", 11724947);
        setIntField(term34657, term34657.getClass(), "startingCredit", 1953277050);
        setField(term34657, term34657.getClass(), "waterLevel", enum89);
        setField(term34657, term34657.getClass(), "temperature", enum90);
        setIntField(term34657, term34657.getClass(), "planetSize", 1283079251);
        setIntField(term34657, term34657.getClass(), "population", -523949691);
        setIntField(term34657, term34657.getClass(), "colonyPop", 1398204340);
        setField(term34657, term34657.getClass(), "extraTech", term34729);
        setField(term34657, term34657.getClass(), "buildings", term34745);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.openRealmOfStars.player.scenario.StartingScenario");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term34657, args);
    }

};


